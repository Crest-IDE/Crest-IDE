package com.crestide.editor

import android.content.Context
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.WebView
import com.crestide.core.platform.ClipboardHelper
import com.crestide.core.platform.KeyboardHelper
import org.json.JSONObject
import org.json.JSONTokener
import java.lang.ref.WeakReference

/**
 * Native Android <-> Mythic Editor Bridge
 *
 * Coordinates bidirectional communication between Jetpack Compose shell
 * and Mythic Editor WebAssembly/virtualized view engine in the WebView.
 */
class MythicBridge(
    private val context: Context? = null,
    private var onReadyCallback: (() -> Unit)? = null,
    private var onContentChangedCallback: ((versionId: Int) -> Unit)? = null,
    private var onSaveRequestedCallback: ((content: String) -> Unit)? = null
) {
    private val TAG = "MythicBridge"
    private var webView: WebView? = null

    fun setWebView(wv: WebView?) {
        if (this.webView != wv) {
            isEditorReady = false
        }
        this.webView = wv
        activeWebView = WeakReference(wv)
    }

    @JavascriptInterface
    fun showKeyboard() {
        webView?.post {
            webView?.let { wv ->
                KeyboardHelper.show(wv)
            }
        }
    }

    @JavascriptInterface
    fun hideKeyboard() {
        webView?.post {
            webView?.let { wv ->
                KeyboardHelper.hide(wv)
            }
        }
    }

    fun setCallbacks(
        onReady: (() -> Unit)? = null,
        onContentChanged: ((versionId: Int) -> Unit)? = null,
        onSaveRequested: ((content: String) -> Unit)? = null
    ) {
        this.onReadyCallback = onReady
        this.onContentChangedCallback = onContentChanged
        this.onSaveRequestedCallback = onSaveRequested
    }

    @JavascriptInterface
    fun getClipboardText(): String {
        val ctx = context ?: return ""
        return ClipboardHelper.getText(ctx)
    }

    @JavascriptInterface
    fun getDeviceInfo(): String {
        return "Android " + android.os.Build.VERSION.RELEASE + " (API " + android.os.Build.VERSION.SDK_INT + ")"
    }

    @JavascriptInterface
    fun onEditorReady(infoJson: String) {
        Log.i(TAG, "Mythic Editor READY: $infoJson")
        isEditorReady = true
        webView?.post {
            pendingOpenFile?.let { pending ->
                pendingOpenFile = null
                openFile(webView, pending.path, pending.content, pending.languageId, pending.isModified)
            }
            onReadyCallback?.invoke()
        }
    }

    @JavascriptInterface
    fun onContentChanged(contentStats: String) {
        Log.d(TAG, "Mythic Editor content changed: $contentStats")
        try {
            val json = JSONObject(contentStats)
            val versionId = json.optInt("versionId", 0)
            onContentChangedCallback?.invoke(versionId)
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing contentStats: ${e.message}")
        }
    }

    @JavascriptInterface
    fun onSaveRequested(content: String) {
        Log.i(TAG, "Mythic Editor requested Save (Ctrl+S)")
        onSaveRequestedCallback?.invoke(content)
    }

    @JavascriptInterface
    fun logNative(message: String) {
        Log.i(TAG, "[Mythic JS]: $message")
    }

    companion object {
        private var activeWebView: WeakReference<WebView>? = null

        @Volatile
        var isEditorReady: Boolean = false
            internal set

        @Volatile
        private var pendingOpenFile: PendingFile? = null

        data class PendingFile(
            val path: String,
            val content: String?,
            val languageId: String,
            val isModified: Boolean
        )

        fun getActiveWebView(): WebView? = activeWebView?.get()

        fun openFile(webView: WebView?, path: String, content: String?, languageId: String, isModified: Boolean = false) {
            val target = webView ?: activeWebView?.get()
            if (!isEditorReady || target == null) {
                pendingOpenFile = PendingFile(path, content, languageId, isModified)
            }
            target?.let { wv ->
                wv.post {
                    val contentArg = if (content != null) JSONObject.quote(content) else "null"
                    val jsCode = "if (window.CrestEditorAPI && window.CrestEditorAPI.openFile) { " +
                            "window.CrestEditorAPI.openFile(" +
                            JSONObject.quote(path) + ", " +
                            contentArg + ", " +
                            JSONObject.quote(languageId) + ", " +
                            isModified + "); }"
                    wv.evaluateJavascript(jsCode, null)
                }
            }
        }

        fun closeFile(webView: WebView?, path: String) {
            val target = webView ?: activeWebView?.get()
            target?.let { wv ->
                wv.post {
                    val jsCode = "if (window.CrestEditorAPI && window.CrestEditorAPI.closeFile) { " +
                            "window.CrestEditorAPI.closeFile(" +
                            JSONObject.quote(path) + "); }"
                    wv.evaluateJavascript(jsCode, null)
                }
            }
        }

        fun renameModel(webView: WebView?, oldPath: String, newPath: String, languageId: String) {
            val target = webView ?: activeWebView?.get()
            target?.let { wv ->
                wv.post {
                    val jsCode = "if (window.CrestEditorAPI && window.CrestEditorAPI.renameModel) { " +
                            "window.CrestEditorAPI.renameModel(" +
                            JSONObject.quote(oldPath) + ", " +
                            JSONObject.quote(newPath) + ", " +
                            JSONObject.quote(languageId) + "); }"
                    wv.evaluateJavascript(jsCode, null)
                }
            }
        }

        fun syncExternalContent(webView: WebView?, path: String, content: String) {
            val target = webView ?: activeWebView?.get()
            target?.let { wv ->
                wv.post {
                    val jsCode = "if (window.CrestEditorAPI && window.CrestEditorAPI.syncExternalContent) { " +
                            "window.CrestEditorAPI.syncExternalContent(" +
                            JSONObject.quote(path) + ", " +
                            JSONObject.quote(content) + "); }"
                    wv.evaluateJavascript(jsCode, null)
                }
            }
        }

        fun getContent(webView: WebView?, callback: (String) -> Unit) {
            webView?.let { wv ->
                wv.evaluateJavascript("window.CrestEditorAPI ? window.CrestEditorAPI.getValue() : ''") { result ->
                    val decoded = try {
                        if (result == null || result == "null") {
                            null
                        } else {
                            JSONTokener(result).nextValue()
                        }
                    } catch (e: Exception) {
                        Log.e("MythicBridge", "Failed to decode editor content", e)
                        null
                    }

                    if (decoded is String) {
                        callback(decoded)
                    } else {
                        Log.e("MythicBridge", "Editor returned no valid string content")
                    }
                }
            }
        }

        fun clearEditor(webView: WebView?) {
            webView?.evaluateJavascript(
                "if (window.CrestEditorAPI && window.CrestEditorAPI.clearEditor) { window.CrestEditorAPI.clearEditor(); }",
                null
            )
        }

        fun undo(webView: WebView?) {
            val target = webView ?: activeWebView?.get()
            target?.let { wv ->
                wv.postDelayed({
                    wv.requestFocus()
                    wv.evaluateJavascript("if (window.CrestEditorAPI && window.CrestEditorAPI.undo) { window.CrestEditorAPI.undo(); }", null)
                }, 50)
            }
        }

        fun redo(webView: WebView?) {
            val target = webView ?: activeWebView?.get()
            target?.let { wv ->
                wv.postDelayed({
                    wv.requestFocus()
                    wv.evaluateJavascript("if (window.CrestEditorAPI && window.CrestEditorAPI.redo) { window.CrestEditorAPI.redo(); }", null)
                }, 50)
            }
        }

        fun triggerAction(webView: WebView?, actionId: String) {
            val target = webView ?: activeWebView?.get()
            if (target == null) return
            target.postDelayed({
                target.requestFocus()
                val js = "if (window.CrestEditorAPI && typeof window.CrestEditorAPI.triggerAction === 'function') { " +
                        "window.CrestEditorAPI.triggerAction(" + JSONObject.quote(actionId) + "); }"
                target.evaluateJavascript(js, null)
            }, 50)
        }

        fun revealLine(webView: WebView?, lineNumber: Int, column: Int = 1) {
            val target = webView ?: activeWebView?.get()
            target?.let { wv ->
                wv.post {
                    val js = "if (window.CrestEditorAPI && window.CrestEditorAPI.revealLine) { " +
                            "window.CrestEditorAPI.revealLine($lineNumber, $column); }"
                    wv.evaluateJavascript(js, null)
                }
            }
        }

        fun getLineCount(webView: WebView?, callback: (Int) -> Unit) {
            val target = webView ?: activeWebView?.get()
            if (target == null) {
                callback(1)
                return
            }
            target.evaluateJavascript("window.CrestEditorAPI ? window.CrestEditorAPI.getLineCount() : 1") { res ->
                val count = res?.toIntOrNull() ?: 1
                callback(count)
            }
        }

        fun handleKey(webView: WebView?, key: String) {
            webView?.evaluateJavascript(
                "if (window.CrestEditorAPI && window.CrestEditorAPI.handleKey) { window.CrestEditorAPI.handleKey(" +
                        JSONObject.quote(key) + "); }", null
            )
        }

        fun typeText(webView: WebView?, text: String) {
            webView?.evaluateJavascript(
                "if (window.CrestEditorAPI && window.CrestEditorAPI.typeText) { window.CrestEditorAPI.typeText(" +
                        JSONObject.quote(text) + "); }", null
            )
        }

        fun applySettings(webView: WebView?, settingsJson: JSONObject) {
            webView?.let { wv ->
                wv.post {
                    val jsCode = "if (window.CrestEditorAPI && window.CrestEditorAPI.applySettings) { " +
                            "window.CrestEditorAPI.applySettings(" + settingsJson.toString() + "); }"
                    wv.evaluateJavascript(jsCode, null)
                }
            }
        }
    }
}

/** Backward compatibility alias */
typealias MonacoBridge = MythicBridge

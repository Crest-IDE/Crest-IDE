package com.crestide.runtime

import android.content.Context
import android.util.Log
import com.termux.terminal.TerminalSession
import java.io.File
import kotlin.concurrent.thread

object TerminalSessionManager {
    private const val TAG = "TerminalSessionManager"

    var activeSession: TerminalSession? = null
        private set
    var activeClient: NativeTerminalClient? = null
        private set

    var onModifiersChanged: ((ctrl: Boolean, alt: Boolean) -> Unit)? = null
        set(value) {
            field = value
            activeClient?.onModifiersChanged = value
        }

    private var isInitializing = false

    fun getOrCreateSession(
        context: Context,
        initialPath: String?,
        onStatusUpdate: (String) -> Unit,
        onSessionReady: (TerminalSession) -> Unit
    ) {
        val existingSession = activeSession
        if (existingSession != null && existingSession.isRunning) {
            Log.d(TAG, "Reattaching to existing active TerminalSession")
            onStatusUpdate("Void Linux Active")
            onSessionReady(existingSession)
            return
        }

        if (isInitializing) {
            Log.d(TAG, "Session initialization already in progress")
            return
        }

        isInitializing = true
        val rootfsManager = RootfsManager(context)

        val client = NativeTerminalClient(context, onSessionFinishedCallback = {
            activeSession = null
            activeClient = null
            onStatusUpdate("Void Linux Process Terminated")
        }).apply {
            onModifiersChanged = this@TerminalSessionManager.onModifiersChanged
        }

        if (rootfsManager.isInstalled) {
            onStatusUpdate("Starting Terminal...")
            thread {
                try {
                    val session = rootfsManager.createTerminalSession(client, initialPath)
                    activeClient = client
                    activeSession = session
                    isInitializing = false
                    onStatusUpdate("Void Linux Active")
                    onSessionReady(session)
                } catch (e: Exception) {
                    isInitializing = false
                    Log.e(TAG, "Error initializing terminal session", e)
                    onStatusUpdate("Error: ${e.localizedMessage}")
                }
            }
        } else {
            // First time setup - launch bootstrap terminal session immediately
            onStatusUpdate("Setting up Void Linux...")
            try {
                val bootstrapSession = rootfsManager.createBootstrapTerminalSession(client, initialPath)
                activeClient = client
                activeSession = bootstrapSession
                onSessionReady(bootstrapSession)

                thread {
                    try {
                        Thread.sleep(250) // Brief breather for TerminalView attachment
                        bootstrapSession.writeToTerminal("\r\n\u001B[1;36m┌──────────────────────────────────────────────┐\u001B[0m\r\n")
                        bootstrapSession.writeToTerminal("\u001B[1;36m│   Crest-IDE • Void Linux Environment Setup   │\u001B[0m\r\n")
                        bootstrapSession.writeToTerminal("\u001B[1;36m└──────────────────────────────────────────────┘\u001B[0m\r\n\r\n")

                        val ready = rootfsManager.setupRootfsEnvironment { status ->
                            onStatusUpdate(status)
                            if (status.startsWith("Downloading Void RootFS:")) {
                                bootstrapSession.writeToTerminal("\r\u001B[K\u001B[1;34m>>>\u001B[0m $status")
                            } else {
                                bootstrapSession.writeToTerminal("\r\n\u001B[1;32m✔\u001B[0m $status\r\n")
                            }
                        }

                        if (ready) {
                            bootstrapSession.writeToTerminal("\r\n\u001B[1;32m✔ Environment initialized! Launching Void Linux...\u001B[0m\r\n\r\n")
                            isInitializing = false
                            onStatusUpdate("Void Linux Active")
                            File(context.filesDir, ".rootfs_ready").createNewFile()
                        } else {
                            isInitializing = false
                            onStatusUpdate("Void Linux Setup Failed")
                            bootstrapSession.writeToTerminal("\r\n\u001B[1;31m✖ Void Linux Setup Failed\u001B[0m\r\n")
                        }
                    } catch (e: Exception) {
                        isInitializing = false
                        Log.e(TAG, "Error during rootfs setup", e)
                        onStatusUpdate("Error: ${e.localizedMessage}")
                        bootstrapSession.writeToTerminal("\r\n\u001B[1;31m✖ Setup error: ${e.localizedMessage}\u001B[0m\r\n")
                    }
                }
            } catch (e: Exception) {
                isInitializing = false
                Log.e(TAG, "Failed launching bootstrap terminal session", e)
                onStatusUpdate("Error: ${e.localizedMessage}")
            }
        }
    }

    fun restartSession(
        context: Context,
        initialPath: String?,
        onStatusUpdate: (String) -> Unit,
        onSessionReady: (TerminalSession) -> Unit
    ) {
        activeSession?.finishIfRunning()
        activeSession = null
        activeClient = null
        if (isInitializing) {
            Log.d(TAG, "Initialization already in progress, ignoring duplicate restart")
            return
        }
        getOrCreateSession(context, initialPath, onStatusUpdate, onSessionReady)
    }

    fun terminateSession() {
        activeSession?.finishIfRunning()
        activeSession = null
        activeClient = null
        isInitializing = false
    }
}

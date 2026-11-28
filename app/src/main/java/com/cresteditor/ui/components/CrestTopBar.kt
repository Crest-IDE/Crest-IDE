package com.cresteditor.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cresteditor.icons.CrestIcons
import com.cresteditor.ui.theme.*

@Composable
fun CrestTopBar(
    projectName: String = "Crest Project",
    onMenuClick: () -> Unit = {},
    onSaveClick: () -> Unit = {},
    onRunClick: () -> Unit = {},
    onUndoClick: () -> Unit = {},
    onRedoClick: () -> Unit = {},
    onSearchClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .background(CrestSurfaceHeader)
            .padding(horizontal = 8.dp)
    ) {
        val totalWidth = maxWidth

        // =====================================================================
        // 1. LEFT CONTROLS (Independently aligned to far left)
        // Uses CrestIcons: Menu, ArrowLeft, ArrowRight
        // =====================================================================
        Row(
            modifier = Modifier.align(Alignment.CenterStart),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onMenuClick,
                modifier = Modifier.size(30.dp)
            ) {
                Icon(
                    imageVector = CrestIcons.Menu,
                    contentDescription = "Open File Explorer",
                    tint = CrestTextPrimary,
                    modifier = Modifier.size(18.dp)
                )
            }

            Spacer(modifier = Modifier.width(6.dp))

            // Back navigation (Undo)
            IconButton(
                onClick = onUndoClick,
                modifier = Modifier.size(28.dp)
            ) {
                Icon(
                    imageVector = CrestIcons.ArrowLeft,
                    contentDescription = "Navigate Back",
                    tint = CrestTextPrimary,
                    modifier = Modifier.size(17.dp)
                )
            }

            Spacer(modifier = Modifier.width(2.dp))

            // Forward navigation (Redo)
            IconButton(
                onClick = onRedoClick,
                modifier = Modifier.size(28.dp)
            ) {
                Icon(
                    imageVector = CrestIcons.ArrowRight,
                    contentDescription = "Navigate Forward",
                    tint = CrestTextPrimary.copy(alpha = 0.75f),
                    modifier = Modifier.size(17.dp)
                )
            }
        }

        // =====================================================================
        // 2. CENTER: Mathematically Centered Command Center Search Bar
        // - Positioned at Alignment.Center relative to toolbar's full width
        // - Uses CrestIcons.Search and CrestIcons.ChevronDown
        // =====================================================================
        val maxAvailableCenterWidth = (totalWidth - 208.dp).coerceAtLeast(120.dp)
        val searchWidth = (totalWidth * 0.52f).coerceIn(160.dp, 560.dp).coerceAtMost(maxAvailableCenterWidth)

        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .width(searchWidth)
                .height(32.dp)
                .background(
                    color = Color(0xFF2E2E2E),
                    shape = RoundedCornerShape(8.dp)
                )
                .border(
                    width = 1.5.dp,
                    color = Color(0xFF555555),
                    shape = RoundedCornerShape(8.dp)
                )
                .clickable { onSearchClick() }
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = CrestIcons.Search,
                contentDescription = "Search",
                tint = Color(0xFF9D9D9D),
                modifier = Modifier.size(15.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = projectName,
                color = Color(0xFFCCCCCC),
                fontSize = 12.5.sp,
                fontWeight = FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(4.dp))

            Icon(
                imageVector = CrestIcons.ChevronDown,
                contentDescription = null,
                tint = Color(0xFF9D9D9D),
                modifier = Modifier.size(15.dp)
            )
        }

        // =====================================================================
        // 3. RIGHT CONTROLS (Independently aligned to far right)
        // Three-dot overflow menu using CrestIcons.KebabVertical
        // =====================================================================
        Box(
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            var showMenu by remember { mutableStateOf(false) }

            IconButton(
                onClick = { showMenu = true },
                modifier = Modifier.size(32.dp)
            ) {
                Icon(
                    imageVector = CrestIcons.KebabVertical,
                    contentDescription = "More Actions",
                    tint = CrestTextPrimary,
                    modifier = Modifier.size(18.dp)
                )
            }

            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false },
                modifier = Modifier.background(CrestSurfaceHeader)
            ) {
                DropdownMenuItem(
                    text = { Text("Save", color = CrestTextPrimary, fontSize = 13.sp) },
                    leadingIcon = {
                        Icon(
                            imageVector = CrestIcons.Save,
                            contentDescription = null,
                            tint = CrestTextPrimary,
                            modifier = Modifier.size(16.dp)
                        )
                    },
                    onClick = {
                        showMenu = false
                        onSaveClick()
                    }
                )

                DropdownMenuItem(
                    text = { Text("Settings", color = CrestTextPrimary, fontSize = 13.sp) },
                    leadingIcon = {
                        Icon(
                            imageVector = CrestIcons.SettingsGear,
                            contentDescription = null,
                            tint = CrestTextPrimary,
                            modifier = Modifier.size(16.dp)
                        )
                    },
                    onClick = {
                        showMenu = false
                        onSettingsClick()
                    }
                )
            }
        }
    }
}

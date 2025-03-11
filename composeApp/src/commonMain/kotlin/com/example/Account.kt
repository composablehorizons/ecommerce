package com.example

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.background
import com.builtwithpaper.LocalSurfaceColor
import com.builtwithpaper.LocalOnSurfaceColor
import androidx.compose.runtime.CompositionLocalProvider
import com.builtwithpaper.LocalContentColor
import com.builtwithpaper.TopAppBar
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import com.builtwithpaper.GhostButton
import androidx.compose.foundation.layout.PaddingValues
import com.composables.icons.lucide.LucideIcon
import com.builtwithpaper.Text
import com.builtwithpaper.LocalTitleLargeTextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.padding
import com.composables.core.HorizontalSeparator
import com.builtwithpaper.LocalOutlineColor
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width

@Composable
fun Account() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalSurfaceColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
            TopAppBar(
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                navigation = {
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                            LucideIcon("arrow-left", contentDescription = "", tint = LocalContentColor.current)
                        }
                    }
                },
                title = {
                    Text("Account", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(start = 4.dp, top = 0.dp, end = 4.dp, bottom = 0.dp)
            )
            Column(modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState())) {
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("person-standing", contentDescription = "", tint = LocalContentColor.current)
                    Text("Account", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("credit-card", contentDescription = "", tint = LocalContentColor.current)
                    Text("Payment methods", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("lock-keyhole", contentDescription = "", tint = LocalContentColor.current)
                    Text("Privacy", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("bell", contentDescription = "", tint = LocalContentColor.current)
                    Text("Notifications", fontSize = 16.sp)
                }
                HorizontalSeparator(color = LocalOutlineColor.current)
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("paintbrush", contentDescription = "", tint = LocalContentColor.current)
                    Text("Look & Feel", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("message-circle-question", contentDescription = "", tint = LocalContentColor.current)
                    Text("FAQ", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("mail", contentDescription = "", tint = LocalContentColor.current)
                    Text("Send Feedback", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("sparkles", contentDescription = "", tint = LocalContentColor.current)
                    Text("See what's new", fontSize = 16.sp)
                }
                HorizontalSeparator(color = LocalOutlineColor.current)
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("newspaper", contentDescription = "", tint = LocalContentColor.current)
                    Text("Legal", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    LucideIcon("handshake", contentDescription = "", tint = LocalContentColor.current)
                    Text("Licenses", fontSize = 16.sp)
                }
                HorizontalSeparator(color = LocalOutlineColor.current)
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 16.dp, bottom = 16.dp, start = 16.dp)) {
                    CompositionLocalProvider(LocalContentColor provides Color(0xFFD6D3D1)) {
                        Spacer(Modifier.heightIn(max = 24.dp).width(48.dp))
                        Text("Version 1.0.0", fontSize = 16.sp)
                    }
                }
            }
        }
    }
}


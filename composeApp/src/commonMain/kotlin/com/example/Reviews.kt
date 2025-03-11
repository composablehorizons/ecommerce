package com.example

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.background
import com.builtwithpaper.LocalBackgroundColor
import com.builtwithpaper.LocalOnBackgroundColor
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.draw.alpha
import com.builtwithpaper.LocalBodyLargeTextStyle
import com.composables.core.HorizontalSeparator
import com.builtwithpaper.LocalOutlineColor
import com.builtwithpaper.LocalTitleMediumTextStyle
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.ui.layout.ContentScale

@Composable
fun Reviews() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
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
                    Text("Reviews", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(start = 4.dp, top = 0.dp, end = 4.dp, bottom = 0.dp)
            )
            Column(verticalArrangement = Arrangement.spacedBy(14.dp), modifier = Modifier.widthIn(max = 600.dp).verticalScroll(rememberScrollState()).padding(16.dp)) {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text("4.5", fontSize = 64.sp, fontWeight = FontWeight(700))
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            }
                            Text("15,604 ratings", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                            LucideIcon("star", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.33f))
                        }
                    }
                }
                HorizontalSeparator(color = LocalOutlineColor.current)
                Text("Reviews", modifier = Modifier.padding(top = 0.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "Kim's Photo", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text("Kim", fontSize = 16.sp)
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            }
                        }
                    }
                    Text("I love this yellow outfit for its flattering cut and how it instantly brightens up my mood, making me feel confident and ready for any occasion.", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp, maxLines = 5)
                }
                HorizontalSeparator(color = LocalOutlineColor.current)
                Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text("James", fontSize = 16.sp)
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            }
                        }
                    }
                    Text("Got this for my girlfriend. She loved it", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp, maxLines = 2)
                }
                HorizontalSeparator(color = LocalOutlineColor.current)
                Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=256&q=80"), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text("Cassidy", fontSize = 16.sp)
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                                LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            }
                        }
                    }
                    Text("Great outfit overall, no complains!!", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp, maxLines = 2)
                }
            }
        }
    }
}


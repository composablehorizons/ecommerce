@file:OptIn(ExperimentalLayoutApi::class)
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
import com.builtwithpaper.currentScreenWidthBreakpoint
import com.builtwithpaper.isAtLeast
import com.builtwithpaper.ScreenWidthBreakpoint
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.ui.layout.ContentScale
import com.builtwithpaper.LocalTitleMediumTextStyle
import com.builtwithpaper.LocalTitleSmallTextStyle
import androidx.compose.ui.draw.alpha
import com.builtwithpaper.LocalBodyLargeTextStyle
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowOverflow
import com.builtwithpaper.OutlinedButton
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.zIndex
import com.builtwithpaper.PrimaryButton

@Composable
fun ProductDetails() {
    val breakpoint = currentScreenWidthBreakpoint()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalSurfaceColor.current)) {
        val breakpoint = currentScreenWidthBreakpoint()

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
                    Text("Details", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(start = 4.dp, top = 0.dp, end = 4.dp, bottom = 0.dp)
            )
            Column(modifier = Modifier.widthIn(max = if (breakpoint isAtLeast ScreenWidthBreakpoint.Small) 1200.dp else 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(top = 0.dp, end = 0.dp, bottom = 40.dp, start = 0.dp)) {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?q=80&w=2124&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.aspectRatio(0.75f).clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text("Yellow Outfit", modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    Text("$120", modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp)
                    GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp), modifier = Modifier.fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                            LucideIcon("star", contentDescription = "", tint = Color(0xFFFB923C))
                            Text("4.5/5", fontSize = 16.sp)
                            Text("(15,604 reviews)", modifier = Modifier.alpha(0.33f), fontSize = 16.sp)
                        }
                    }
                    Text("Yellow outfit, includes yellow top and yellow bottom.", modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    Text("Size", modifier = Modifier.fillMaxWidth().padding(top = 24.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(4.dp), verticalArrangement = Arrangement.spacedBy(4.dp), maxItemsInEachRow = 4, overflow = FlowRowOverflow.Visible, modifier = Modifier.padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("XXS", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("XS", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("S", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("M", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("L", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("XL", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("XXL", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                        OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 0.dp, top = 12.dp, end = 0.dp, bottom = 12.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("XXXL", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                    }
                    Text("Product Details", modifier = Modifier.fillMaxWidth().padding(top = 24.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    Text("Yellow outfit, includes yellow top and yellow bottom.", modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    Text("About this item", modifier = Modifier.fillMaxWidth().padding(top = 24.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    Text("Yellow outfit, includes yellow top and yellow bottom.", modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    Text("Size & Fit", modifier = Modifier.fillMaxWidth().padding(top = 24.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    Text("Yellow outfit, includes yellow top and yellow bottom.", modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                }
            }
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(LocalSurfaceColor.current).padding(16.dp)) {
                CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.widthIn(max = 800.dp).weight(1f, fill = false).fillMaxWidth()) {
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text("Yellow Outfit", fontSize = 16.sp)
                            Text("$120", style = LocalTitleSmallTextStyle.current, fontSize = 16.sp)
                        }
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(12.dp)) {
                            Text("Add to Cart", fontSize = 16.sp)
                        }
                    }
                }
            }
        }
    }
}


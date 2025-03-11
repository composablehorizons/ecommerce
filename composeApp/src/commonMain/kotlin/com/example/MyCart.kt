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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.padding
import com.builtwithpaper.Card
import com.builtwithpaper.LocalSurfaceColor
import com.builtwithpaper.LocalOnSurfaceColor
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import com.builtwithpaper.LocalBodyLargeTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.draw.alpha
import com.builtwithpaper.LocalPrimaryColor
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.zIndex
import com.builtwithpaper.LocalTitleSmallTextStyle
import com.builtwithpaper.PrimaryButton
import com.builtwithpaper.BottomNavigation
import androidx.compose.foundation.layout.heightIn
import com.builtwithpaper.currentScreenWidthBreakpoint
import com.builtwithpaper.isAtLeast
import com.builtwithpaper.ScreenWidthBreakpoint
import com.builtwithpaper.TabItem

@Composable
fun MyCart() {
    val breakpoint = currentScreenWidthBreakpoint()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        val breakpoint = currentScreenWidthBreakpoint()

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
                    Text("My Cart", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(start = 4.dp, top = 0.dp, end = 4.dp, bottom = 0.dp)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(16.dp)) {
                Card(modifier = Modifier.fillMaxWidth(), elevation = 4.dp, backgroundColor = LocalSurfaceColor.current, contentColor = LocalOnSurfaceColor.current, shape = RoundedCornerShape(LocalCornerRadius.current)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Row(modifier = Modifier.padding(16.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?q=80&w=2124&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(96.dp).height(96.dp).clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                        }
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 0.dp)) {
                                Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
                                    Text("Yellow Outfit", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), style = LocalBodyLargeTextStyle.current, fontSize = 20.sp, fontWeight = FontWeight(500))
                                    Text("$120", style = LocalBodyLargeTextStyle.current, fontSize = 20.sp, fontWeight = FontWeight(500))
                                }
                                Text("Size L", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Qty 1", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                                GhostButton(onClick = { /* TODO Handle this */ }, contentColor = LocalPrimaryColor.current, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                                    Text("Remove", fontSize = 16.sp, maxLines = 1)
                                }
                            }
                        }
                    }
                }
                Card(modifier = Modifier.fillMaxWidth(), elevation = 4.dp, backgroundColor = LocalSurfaceColor.current, contentColor = LocalOnSurfaceColor.current, shape = RoundedCornerShape(LocalCornerRadius.current)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Row(modifier = Modifier.padding(16.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1487222477894-8943e31ef7b2?q=80&w=3408&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(96.dp).height(96.dp).clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                        }
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 0.dp)) {
                                Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
                                    Text("Leather Jacket", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), style = LocalBodyLargeTextStyle.current, fontSize = 20.sp, fontWeight = FontWeight(500))
                                    Text("$190", style = LocalBodyLargeTextStyle.current, fontSize = 20.sp, fontWeight = FontWeight(500))
                                }
                                Text("Size L", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Qty 1", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                                GhostButton(onClick = { /* TODO Handle this */ }, contentColor = LocalPrimaryColor.current, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                                    Text("Remove", fontSize = 16.sp, maxLines = 1)
                                }
                            }
                        }
                    }
                }
                Card(modifier = Modifier.fillMaxWidth(), elevation = 4.dp, backgroundColor = LocalSurfaceColor.current, contentColor = LocalOnSurfaceColor.current, shape = RoundedCornerShape(LocalCornerRadius.current)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Row(modifier = Modifier.padding(16.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1554838692-3b50e4261b6f?q=80&w=3456&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(96.dp).height(96.dp).clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                        }
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 0.dp)) {
                                Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
                                    Text("Red Shades", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), style = LocalBodyLargeTextStyle.current, fontSize = 20.sp, fontWeight = FontWeight(500))
                                    Text("$50", style = LocalBodyLargeTextStyle.current, fontSize = 20.sp, fontWeight = FontWeight(500))
                                }
                                Text("Size L", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Qty 1", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                                GhostButton(onClick = { /* TODO Handle this */ }, contentColor = LocalPrimaryColor.current, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                                    Text("Remove", fontSize = 16.sp, maxLines = 1)
                                }
                            }
                        }
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(LocalSurfaceColor.current).padding(16.dp)) {
                CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.widthIn(max = 800.dp).weight(1f, fill = false).fillMaxWidth()) {
                        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                            Text("Subtotal", fontSize = 16.sp)
                            Text("$360", style = LocalTitleSmallTextStyle.current, fontSize = 16.sp)
                        }
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(12.dp), modifier = Modifier.fillMaxWidth()) {
                            Text("Go to checkout", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                    }
                }
            }
            BottomNavigation(modifier = Modifier.heightIn(56.dp).fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(if (breakpoint isAtLeast ScreenWidthBreakpoint.Small) LocalSurfaceColor.current else Color.Unspecified), contentColor = LocalOnSurfaceColor.current, backgroundColor = LocalSurfaceColor.current) {
                TabItem(selected = false, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("house", contentDescription = "", tint = LocalContentColor.current)
                        Text("Discover", fontSize = 16.sp)
                    }
                }
                TabItem(selected = true, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("shopping-cart", contentDescription = "", tint = LocalContentColor.current)
                        Text("Cart", fontSize = 16.sp)
                    }
                }
                TabItem(selected = false, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("contact-round", contentDescription = "", tint = LocalContentColor.current)
                        Text("Account", fontSize = 16.sp)
                    }
                }
            }
        }
    }
}


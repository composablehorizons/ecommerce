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
import com.builtwithpaper.Text
import com.builtwithpaper.LocalTitleLargeTextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.border
import com.builtwithpaper.LocalOutlineColor
import com.composables.icons.lucide.LucideIcon
import com.builtwithpaper.TextField
import androidx.compose.ui.text.TextStyle
import com.builtwithpaper.GhostButton
import androidx.compose.ui.draw.alpha
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import com.builtwithpaper.PrimaryButton
import com.builtwithpaper.OutlinedButton
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import com.builtwithpaper.currentScreenWidthBreakpoint
import com.builtwithpaper.isAtLeast
import com.builtwithpaper.ScreenWidthBreakpoint
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import com.builtwithpaper.BottomNavigation
import androidx.compose.foundation.layout.heightIn
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.zIndex
import androidx.compose.ui.graphics.Color
import com.builtwithpaper.TabItem
import com.builtwithpaper.LocalPrimaryColor

@Composable
fun Discover() {
    val breakpoint = currentScreenWidthBreakpoint()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalSurfaceColor.current)) {
        val breakpoint = currentScreenWidthBreakpoint()

        CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
            TopAppBar(
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                title = {
                    Text("Discover", style = LocalTitleLargeTextStyle.current, fontSize = 16.sp)
                },
                contentPadding = PaddingValues(start = 4.dp, top = 0.dp, end = 4.dp, bottom = 0.dp)
            )
            Column(modifier = Modifier.widthIn(max = 600.dp).weight(weight = 1f, fill = false).fillMaxHeight().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(top = 8.dp, end = 0.dp, bottom = 0.dp, start = 0.dp)) {
                val breakpoint = currentScreenWidthBreakpoint()

                Row(modifier = Modifier.padding(16.dp)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.height(56.dp).weight(1f, fill = false).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).border(1.dp, LocalOutlineColor.current, RoundedCornerShape(LocalCornerRadius.current)).background(LocalSurfaceColor.current).padding(top = 0.dp, end = 8.dp, bottom = 0.dp, start = 16.dp)) {
                        CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                            LucideIcon("search", contentDescription = "", tint = LocalContentColor.current)
                            TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "Search", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), textStyle = TextStyle.Default, fontSize = 16.sp)
                            Row {
                                GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                                    LucideIcon("mic", contentDescription = "", tint = LocalContentColor.current, modifier = Modifier.alpha(0.66f))
                                }
                            }
                        }
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()).padding(top = 0.dp, end = 16.dp, bottom = 8.dp, start = 16.dp)) {
                    PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                        Text("All", fontSize = 16.sp, maxLines = 1)
                    }
                    OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                        Text("T-Shirts", fontSize = 16.sp, maxLines = 1)
                    }
                    OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                        Text("Jeans", fontSize = 16.sp, maxLines = 1)
                    }
                    OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                        Text("Accessories", fontSize = 16.sp, maxLines = 1)
                    }
                    OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                        Text("Shoes", fontSize = 16.sp, maxLines = 1)
                    }
                    OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                        Text("Wallets", fontSize = 16.sp, maxLines = 1)
                    }
                }
                LazyVerticalGrid(columns = if (breakpoint isAtLeast ScreenWidthBreakpoint.Small) GridCells.Fixed(3) else GridCells.Fixed(2), modifier = Modifier.fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight(), contentPadding = PaddingValues(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp), verticalArrangement = Arrangement.spacedBy(8.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    item {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?q=80&w=2124&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                                Text("Yellow Outfit", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontWeight = FontWeight(500))
                                Text("$120.00", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                        }
                    }
                    item {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1487222477894-8943e31ef7b2?q=80&w=3408&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                                Text("Leather Jacket", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontWeight = FontWeight(500))
                                Text("$190.00", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                        }
                    }
                    item {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1554838692-3b50e4261b6f?q=80&w=3456&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "Red Shades photo", modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                                Text("Red Shades", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontWeight = FontWeight(500))
                                Text("$50.00", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                        }
                    }
                    item {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1521572163474-6864f9cf17ab?q=80&w=3000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                                Text("Basic T-Shirt", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontWeight = FontWeight(500))
                                Text("$20.00", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                        }
                    }
                    item {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1510060637021-6287bd1b5232?q=80&w=3542&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "Basic Cap photo", modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                                Text("Basic Cap", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontWeight = FontWeight(500))
                                Text("$35.00", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                        }
                    }
                    item {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1519027356316-9f99e11d8bac?q=80&w=3870&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                                Text("Cardigan", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontWeight = FontWeight(500))
                                Text("$90.00", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp)
                            }
                        }
                    }
                }
            }
            BottomNavigation(modifier = Modifier.heightIn(56.dp).fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(if (breakpoint isAtLeast ScreenWidthBreakpoint.Small) LocalSurfaceColor.current else Color.Unspecified), contentColor = LocalOnSurfaceColor.current, backgroundColor = LocalSurfaceColor.current) {
                TabItem(selected = true, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("house", contentDescription = "", tint = LocalContentColor.current)
                        Text("Discover", fontSize = 16.sp)
                    }
                }
                TabItem(selected = false, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
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


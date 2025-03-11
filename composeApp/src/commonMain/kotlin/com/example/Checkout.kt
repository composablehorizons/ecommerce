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
import com.builtwithpaper.LocalTitleMediumTextStyle
import androidx.compose.ui.text.font.FontWeight
import com.builtwithpaper.LocalTitleSmallTextStyle
import com.builtwithpaper.TextField
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import com.builtwithpaper.LocalBodyLargeTextStyle
import com.composables.core.HorizontalSeparator
import com.builtwithpaper.LocalOutlineColor
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.zIndex
import androidx.compose.foundation.layout.Spacer
import com.builtwithpaper.PrimaryButton

@Composable
fun Checkout() {
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
                    Text("Checkout", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(start = 4.dp, top = 0.dp, end = 4.dp, bottom = 0.dp)
            )
            Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(top = 16.dp, end = 16.dp, bottom = 48.dp, start = 16.dp)) {
                Text("Contact Information", style = LocalTitleMediumTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                Text("Email address", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, placeholderText = "alex@example.com", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                HorizontalSeparator(color = LocalOutlineColor.current)
                Text("Shipping Information", style = LocalTitleMediumTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                Text("First Name", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("Last Name", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("Company Name", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("Address", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("Apartment, suite, etc", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("City", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                HorizontalSeparator(color = LocalOutlineColor.current)
                Text("Country", style = LocalTitleMediumTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("State/Province", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("Postal Code", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                HorizontalSeparator(color = LocalOutlineColor.current)
                Text("Payment", style = LocalTitleMediumTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                    Text("Credit Card", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                    Text("Paypal", fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                    Text("e-transfer", fontSize = 16.sp)
                }
                Text("Card number", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Text("Name on card", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    Column(modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                        Text("Exp. date(MM/YY)", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                        TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Text("CVC", modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 8.dp, start = 0.dp), style = LocalTitleSmallTextStyle.current, fontSize = 16.sp, fontWeight = FontWeight(700))
                        TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    }
                }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(LocalSurfaceColor.current)) {
                CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                    Column(modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().padding(16.dp)) {
                        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                            Text("Subtotal", fontSize = 16.sp)
                            Text("$190", fontSize = 16.sp)
                        }
                        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                            Text("Shipping", fontSize = 16.sp)
                            Text("$190", fontSize = 16.sp)
                        }
                        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                            Text("Taxes", fontSize = 16.sp)
                            Text("$190", fontSize = 16.sp)
                        }
                        HorizontalSeparator(color = LocalOutlineColor.current)
                        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                            Text("Total", fontSize = 16.sp)
                            Text("$190", fontSize = 16.sp)
                        }
                        Spacer(Modifier.height(24.dp).fillMaxWidth())
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp), modifier = Modifier.fillMaxWidth()) {
                            Text("Confirm Order", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                        }
                    }
                }
            }
        }
    }
}


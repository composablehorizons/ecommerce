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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.padding
import com.builtwithpaper.Text
import com.builtwithpaper.LocalTitleLargeTextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.alpha
import com.builtwithpaper.LocalBodyLargeTextStyle
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.builtwithpaper.LocalTitleMediumTextStyle
import com.builtwithpaper.TextField
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.ui.text.TextStyle
import com.builtwithpaper.PrimaryButton
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Row
import com.builtwithpaper.LocalOutlineColor
import com.builtwithpaper.OutlinedButton
import com.composables.core.Icon
import com.builtwithpaper.Google
import androidx.compose.ui.graphics.Color
import com.builtwithpaper.Facebook
import com.builtwithpaper.GhostButton

@Composable
fun SignUp() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(16.dp)) {
                Text("Create an account", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, fontSize = 16.sp)
                Text("Let's create your account", modifier = Modifier.fillMaxWidth().alpha(0.66f), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Spacer(Modifier.height(12.dp).fillMaxWidth())
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("Full name", modifier = Modifier.fillMaxWidth(), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, placeholderText = "John Smith", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("Email", modifier = Modifier.fillMaxWidth(), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, placeholderText = "john@example.com", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("Password", modifier = Modifier.fillMaxWidth(), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, placeholderText = "A strong password", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Text("By signing up you agree to our Terms and Privacy Policy.", modifier = Modifier.fillMaxWidth().padding(top = 12.dp, end = 0.dp, bottom = 12.dp, start = 0.dp), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), modifier = Modifier.fillMaxWidth()) {
                    Text("Create Account", modifier = Modifier.fillMaxWidth(), style = LocalBodyLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 12.dp, end = 0.dp, bottom = 12.dp, start = 0.dp)) {
                    Spacer(Modifier.height(1.dp).weight(1f, fill = false).fillMaxWidth().background(LocalOutlineColor.current))
                    Text("or", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    Spacer(Modifier.height(1.dp).weight(1f, fill = false).fillMaxWidth().background(LocalOutlineColor.current))
                }
                OutlinedButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), modifier = Modifier.fillMaxWidth()) {
                    Row(horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Icon(Google, contentDescription = "", tint = LocalContentColor.current)
                        Text("Continue with Google", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    }
                }
                PrimaryButton(onClick = { /* TODO Handle this */ }, backgroundColor = Color(0xFF1D4ED8), contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderColor = Color(0xFF1D4ED8), modifier = Modifier.fillMaxWidth()) {
                    Row(horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Icon(Facebook, contentDescription = "", tint = LocalContentColor.current)
                        Text("Continue with Facebook", style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                    }
                }
                GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), modifier = Modifier.fillMaxWidth()) {
                    Text("Already have an account?", modifier = Modifier.fillMaxWidth().alpha(0.66f), style = LocalBodyLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp, maxLines = 1)
                }
            }
        }
    }
}


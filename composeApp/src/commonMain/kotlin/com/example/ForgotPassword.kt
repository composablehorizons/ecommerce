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
import com.builtwithpaper.PrimaryButton
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ForgotPassword() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(16.dp)) {
                Text("Forgot password", modifier = Modifier.fillMaxWidth(), style = LocalTitleLargeTextStyle.current, fontSize = 16.sp)
                Text("Enter your email below and we will send you a link to reset your password", modifier = Modifier.fillMaxWidth().alpha(0.66f), style = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                Spacer(Modifier.height(12.dp).fillMaxWidth())
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("Email", modifier = Modifier.fillMaxWidth(), style = LocalTitleMediumTextStyle.current, fontSize = 16.sp)
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.fillMaxWidth(), maxLines = 1, placeholderText = "john@example.com", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = LocalBodyLargeTextStyle.current, fontSize = 16.sp)
                }
                Spacer(Modifier.height(24.dp).fillMaxWidth())
                PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), modifier = Modifier.fillMaxWidth()) {
                    Text("Send code", modifier = Modifier.fillMaxWidth(), style = LocalBodyLargeTextStyle.current, textAlign = TextAlign.Center, fontSize = 16.sp)
                }
            }
        }
    }
}


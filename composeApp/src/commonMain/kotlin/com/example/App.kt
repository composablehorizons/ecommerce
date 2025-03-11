package com.example

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.builtwithpaper.Theme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun App() {
    val navController = rememberNavController()
    Theme(primaryColor = Color(0xFF262626), onPrimaryColor = Color(0xFFFFFFFF), secondaryColor = Color(0xFFE0F2FE), onSecondaryColor = Color(0xFF1A1A1A), backgroundColor = Color(0xFFFAFAFA), onBackgroundColor = Color(0xFF0F172A), surfaceColor = Color(0xFFFFFFFF), onSurfaceColor = Color(0xFF1A1A1A), destructiveColor = Color(0xFFDC2626), onDestructiveColor = Color(0xFFFFFFFF), outlineColor = Color(0xFFD1D5DB), titleLarge = TextStyle(fontWeight = FontWeight(600), fontSize = 32.sp, lineHeight = 27.sp), titleMedium = TextStyle(fontWeight = FontWeight(500), fontSize = 24.sp, lineHeight = 18.sp), titleSmall = TextStyle(fontWeight = FontWeight(500), fontSize = 18.sp, lineHeight = 15.sp), bodyLarge = TextStyle(fontWeight = FontWeight(400), fontSize = 16.sp, lineHeight = 21.sp), bodyMedium = TextStyle(fontWeight = FontWeight(400), fontSize = 16.sp, lineHeight = 18.sp), bodySmall = TextStyle(fontWeight = FontWeight(400), fontSize = 10.sp, lineHeight = 15.sp), cornerRadius = 8.dp) {
        NavHost(navController = navController, startDestination = "SignUp") {
            composable(route = "SignUp") {
                SignUp()
            }
            composable(route = "Login") {
                Login()
            }
            composable(route = "Forgotpassword") {
                ForgotPassword()
            }
            composable(route = "ResetPassword") {
                ResetPassword()
            }
            composable(route = "Discover") {
                Discover()
            }
            composable(route = "ProductDetails") {
                ProductDetails()
            }
            composable(route = "Reviews") {
                Reviews()
            }
            composable(route = "MyCart") {
                MyCart()
            }
            composable(route = "Checkout") {
                Checkout()
            }
            composable(route = "Account") {
                Account()
            }
        }
    }
}


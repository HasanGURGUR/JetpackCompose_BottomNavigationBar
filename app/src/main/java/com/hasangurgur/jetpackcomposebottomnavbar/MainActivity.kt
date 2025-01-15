package com.hasangurgur.jetpackcomposebottomnavbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.hasangurgur.jetpackcomposebottomnavbar.ui.theme.JetpackComposeBottomNavBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeBottomNavBarTheme {
                MainScreen()
            }
        }
    }
}



package com.tlw.composeplayground.projects.smartdashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tlw.composeplayground.projects.smartdashboard.ui.screen.SignUpScreen
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.ComposePlaygroundTheme

class SmartDashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePlaygroundTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    SignUpScreen(innerPadding)
                }
            }
        }
    }
}

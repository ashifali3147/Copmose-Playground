package com.tlw.composeplayground.projects.smartdashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.tlw.composeplayground.projects.smartdashboard.ui.navigation.Routes
import com.tlw.composeplayground.projects.smartdashboard.ui.screen.ControlDeviceScreen
import com.tlw.composeplayground.projects.smartdashboard.ui.screen.SignUpScreen
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.ComposePlaygroundTheme

class SmartDashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val backStack = rememberNavBackStack(Routes.SignUpPage)
            ComposePlaygroundTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),

                    ) { innerPadding ->
                    NavDisplay(
                        backStack = backStack,
                        transitionSpec = {
                            slideInHorizontally { it } togetherWith
                                    slideOutHorizontally { -it }
                        },
                        entryProvider = { key ->
                            when (key) {
                                is Routes.SignUpPage -> {
                                    NavEntry(key) {
                                        SignUpScreen(innerPadding, backStack)
                                    }
                                }

                                is Routes.DashBoardScreen -> {
                                    NavEntry(key) {
                                        ControlDeviceScreen(innerPadding, backStack)
                                    }
                                }

                                else -> error("Path not find")
                            }
                        }
                    )
                }
            }
        }
    }
}

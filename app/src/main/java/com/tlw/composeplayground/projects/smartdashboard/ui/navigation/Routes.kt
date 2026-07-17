package com.tlw.composeplayground.projects.smartdashboard.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Routes: NavKey {
    @Serializable
    data object SignUpPage: Routes
    @Serializable
    data object DashBoardScreen: Routes
}
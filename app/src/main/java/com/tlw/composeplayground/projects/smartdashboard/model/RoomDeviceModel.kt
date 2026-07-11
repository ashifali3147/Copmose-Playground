package com.tlw.composeplayground.projects.smartdashboard.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AcUnit
import androidx.compose.material.icons.rounded.Lightbulb
import androidx.compose.material.icons.rounded.Microwave
import androidx.compose.material.icons.rounded.ModeFanOff
import androidx.compose.material.icons.rounded.Router
import androidx.compose.material.icons.rounded.Tv
import androidx.compose.ui.graphics.vector.ImageVector

data class RoomDeviceModel(
    val id: Int,
    val name: String,
    val icon: ImageVector,
    val isEnable: Boolean
)

fun getRoomDeviceList(): List<RoomDeviceModel> {
    return listOf(
        RoomDeviceModel(id = 1, name = "AC", icon = Icons.Rounded.AcUnit, isEnable = true),
        RoomDeviceModel(id = 2, name = "Light", icon = Icons.Rounded.Lightbulb, isEnable = true),
        RoomDeviceModel(id = 3, name = "Oven", icon = Icons.Rounded.Microwave, isEnable = false),
        RoomDeviceModel(id = 4, name = "Fan", icon = Icons.Rounded.ModeFanOff, isEnable = false),
        RoomDeviceModel(id = 5, name = "TV", icon = Icons.Rounded.Tv, isEnable = true),
        RoomDeviceModel(id = 6, name = "Router", icon = Icons.Rounded.Router, isEnable = true),
    )
}

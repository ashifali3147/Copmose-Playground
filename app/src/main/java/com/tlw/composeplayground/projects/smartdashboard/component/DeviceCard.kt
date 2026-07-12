package com.tlw.composeplayground.projects.smartdashboard.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tlw.composeplayground.projects.smartdashboard.model.RoomDeviceModel
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.Green40
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.TileColor

@Composable
fun DeviceCard(
    modifier: Modifier = Modifier,
    device: RoomDeviceModel,
    callBack: (value: RoomDeviceModel) -> Unit
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(TileColor),
        border = BorderStroke(width = 3.dp, color = Green40),
        shape = RoundedCornerShape(18)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                Modifier.padding(horizontal = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "On",
                    style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.weight(1f)
                )
                Switch(
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Green40,
                        checkedTrackColor = Color.LightGray.copy(alpha = .5f),
                        checkedBorderColor = TileColor,
                        uncheckedThumbColor = Color.Black,
                        uncheckedTrackColor = Color.LightGray.copy(alpha = .5f),
                        uncheckedBorderColor = TileColor,
                    ),
                    checked = device.isEnable,
                    onCheckedChange = { callBack(device) },
                    thumbContent = {
                        Icon(
                            imageVector = Icons.Filled.PowerSettingsNew,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(SwitchDefaults.IconSize),
                        )
                    }
                )
            }
            Spacer(Modifier.height(10.dp))
            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = device.icon,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(Modifier.height(5.dp))
            Text(
                device.name,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}
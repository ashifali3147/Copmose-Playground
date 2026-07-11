package com.tlw.composeplayground.projects.smartdashboard.ui.screen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tlw.composeplayground.projects.smartdashboard.component.InfoTile
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.Green40
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.TileColor

@Composable
fun ControlDeviceScreen(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Black,
                        Color(0xFF333333)
                    )
                )
            )
            .padding(innerPadding)
    ) {
        Column(
            modifier = Modifier
                .padding(all = 20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(
                            TileColor
                        ),
                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                    contentDescription = null,
                    tint = Color.White
                )

                Text(
                    modifier = Modifier.weight(1f),
                    text = "Control Devices", color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center
                )

                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(
                            TileColor
                        )
                        .padding(all = 5.dp),
                    imageVector = Icons.Rounded.MoreVert,
                    contentDescription = null,
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    modifier = Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(TileColor)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                "28°C",
                                style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
                                color = Green40,
                                textAlign = TextAlign.Start,
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                imageVector = Icons.Filled.Cloud,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text("Cloudy", color = Color.White, style = MaterialTheme.typography.titleMedium)
                        Text("Indoor humidity", color = Color.Gray, style = MaterialTheme.typography.bodyMedium)
                        Text("Living Room", color = Color.White, style = MaterialTheme.typography.titleLarge)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    InfoTile(heading = "Lite", info = "Total 5")
                    InfoTile(heading = "Service", info = "Total 20")
                    InfoTile(heading = "Active Device", info = "Total 6")
                }
            }

        }
    }

}
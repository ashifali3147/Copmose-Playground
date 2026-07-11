package com.tlw.composeplayground.projects.smartdashboard.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.TileColor

@Composable
fun InfoTile(heading: String, info: String) {
    Card(
        modifier = Modifier.width(width = 120.dp).padding(bottom = 5.dp),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(TileColor)
    ) {
        Column(modifier = Modifier.padding(horizontal = 5.dp, vertical = 10.dp)) {
            Text(heading, color = Color.Gray, style = MaterialTheme.typography.bodyMedium)
            Text(info, color = Color.White, style = MaterialTheme.typography.titleMedium)
        }
    }
}
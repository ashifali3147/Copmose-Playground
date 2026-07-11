package com.tlw.composeplayground.projects.smartdashboard.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tlw.composeplayground.projects.smartdashboard.model.RoomFilterModel
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.Green40
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.TileColor

@Composable
fun ChipGroup(roomFilterList: List<RoomFilterModel>, onChipClick: (RoomFilterModel) -> Unit) {
    LazyRow {
        items(roomFilterList) { item ->
            FilterChip(
                modifier = Modifier
                    .padding(5.dp),
                shape = RoundedCornerShape(20.dp),
                border = null,
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = TileColor,
                    labelColor = Color.White,
                    selectedContainerColor = Green40,
                    selectedLabelColor = Color.White,
                    disabledContainerColor = TileColor,
                    disabledLabelColor = Color.White
                ),
                onClick = { onChipClick(item) },
                selected = item.isSelected,
                label = { Text(item.name, modifier = Modifier.padding(vertical = 10.dp)) },
            )
        }
    }
}
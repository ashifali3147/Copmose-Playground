package com.tlw.composeplayground.projects.smartdashboard.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SmartTextField(modifier: Modifier = Modifier, label: String, value: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        label = {Text(label)},
        shape = RoundedCornerShape(8.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color(0xFF263131),
            unfocusedContainerColor = Color(0xFF263131),
            unfocusedTextColor = Color.White,
            focusedTextColor = Color.White,
            focusedLabelColor = Color.White,
            unfocusedLabelColor = Color.White,
            errorLabelColor = Color.Red,
            unfocusedBorderColor = Color(0xFF2D3335),
            focusedBorderColor = Color(0xFF2D3335),
            cursorColor = Color.White,
            errorCursorColor = Color.Red,
        )
    )
}
package com.tlw.composeplayground.ui.basic

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NameListCompose(innerPadding: PaddingValues) {
    var name by remember {
        mutableStateOf("")
    }
    var names by remember {
        mutableStateOf(emptyList<String>())
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = name,
                onValueChange = {
                    name = it
                },
            )
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {
                    if (name.isNotBlank()) {
                        names = names + name
                        name = ""
                        return@Button
                    }

                }) {
                Text("Add")
            }
        }
        Spacer(Modifier.height(50.dp))
        LazyColumn(modifier = Modifier.weight(1f)) {
            items(names) { currentName ->
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 10.dp)
                        .padding(bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(start = 10.dp),
                        text = currentName,
                        fontSize = 20.sp
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}
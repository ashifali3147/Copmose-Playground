package com.tlw.composeplayground.projects.smartdashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.tlw.composeplayground.R
import com.tlw.composeplayground.projects.smartdashboard.component.SmartTextField
import com.tlw.composeplayground.projects.smartdashboard.component.SocialButton
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.ComposePlaygroundTheme
import com.tlw.composeplayground.projects.smartdashboard.ui.theme.Green40

class SmartDashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePlaygroundTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
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
                            modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(
                                        Color(0xFF273233)
                                    ),
                                imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                                contentDescription = null,
                                tint = Color.White
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                "Sign Up",
                                color = Color.White,
                                style = MaterialTheme.typography.headlineLarge
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                "New here? Let's get started on your smart home journey in just few simple steps",
                                color = Color.White,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Spacer(modifier = Modifier.height(30.dp))
                            SmartTextField(label = "Name", value = "") {

                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            SmartTextField(label = "Email", value = "") {

                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            SmartTextField(label = "Password", value = "") {

                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    modifier = Modifier.weight(1f),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Checkbox(
                                        checked = true,
                                        onCheckedChange = {},
                                    )
                                    Text("Remember me", color = Color.White)
                                }
                                Text("Forget password?", color = Green40)
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Button(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp),
                                onClick = {}
                            ) { Text("Create Account", fontWeight = FontWeight.Bold) }
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                HorizontalDivider(modifier = Modifier.weight(1f))
                                Text(
                                    "Or Sign In With",
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 10.dp)
                                )
                                HorizontalDivider(modifier = Modifier.weight(1f))
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            SocialButton(
                                icon = R.drawable.google,
                                title = "Sign Up with Google"
                            ) { }
                            Spacer(modifier = Modifier.height(20.dp))
                            SocialButton(icon = R.drawable.apple, title = "Sign Up with Apple") { }

                        }
                    }
                }
            }
        }
    }
}

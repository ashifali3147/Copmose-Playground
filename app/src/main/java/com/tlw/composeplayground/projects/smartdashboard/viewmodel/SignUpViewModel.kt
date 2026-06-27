package com.tlw.composeplayground.projects.smartdashboard.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    var name by mutableStateOf("")
        private set

    fun onNameChange(value: String) {
        name = value
    }
    var email by mutableStateOf("")
        private set

    fun onEmailChange(value: String) {
        email = value
    }
    var password by mutableStateOf("")
        private set

    fun onPasswordChange(value: String) {
        password = value
    }
    var isRemember by mutableStateOf(false)
        private set

    fun onRememberMeChange(value: Boolean) {
        isRemember = value
    }
}
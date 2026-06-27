package com.tlw.composeplayground.projects.smartdashboard.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

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

    private val _isRemember = MutableStateFlow(false)

    val isRemember: StateFlow<Boolean> = _isRemember.asStateFlow()

    fun onRememberMeChange(value: Boolean) {
        _isRemember.value = value
    }
}
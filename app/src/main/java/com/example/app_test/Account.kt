package com.example.app_test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Account(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavBar()
        }
    ) { innerPadding ->
        Greeting(
            name = "Derek",
            from = "DEREK",
            modifier = Modifier.padding(innerPadding)
        )
    }
}
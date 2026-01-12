package com.food.jetpackcompose_hilt_enterypoint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.food.jetpackcompose_hilt_enterypoint.ui.theme.JetpackComposeHiltEnteryPointTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeHiltEnteryPointTheme {
                MainScreen()
            }
        }
    }
}

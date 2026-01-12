package com.food.jetpackcompose_hilt_enterypoint

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.food.jetpackcompose_hilt_enterypoint.manager.LegacyManager

@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {
    val legacyManager = remember {
        LegacyManager(context)
    }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ViewModel: ${viewModel.getUser()}")
        Text(text = "EntryPoint: ${legacyManager.fetchUser()}")
    }
}
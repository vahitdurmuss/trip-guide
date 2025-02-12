package com.triona.triplab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.triona.triplab.screens.HomeScreen
import com.triona.triplab.ui.theme.TripLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TripLabTheme {
                HomeScreen(modifier = Modifier)
            }
        }
    }
}
package com.triona.triplab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.room.Room
import com.triona.triplab.data.room.TripGuiderDatabase
import com.triona.triplab.screens.HomeScreen
import com.triona.triplab.ui.theme.TripLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val db= Room.databaseBuilder(
            context = applicationContext,
            TripGuiderDatabase::class.java,
            "trip_guider_database"
        ).build()

        setContent {
            TripLabTheme {
                HomeScreen(modifier = Modifier)
            }
        }
    }
}
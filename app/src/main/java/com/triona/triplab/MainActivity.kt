package com.triona.triplab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.triona.triplab.data.MuglaDummyTrip
import com.triona.triplab.data.Trip
import com.triona.triplab.data.TripStep
import com.triona.triplab.ui.TripStory
import com.triona.triplab.ui.theme.TripLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TripLabTheme {
                val onClickTripStep: (TripStep)->Unit ={}
                val onClickRoadMap:(Trip)->Unit={}
                TripStory(MuglaDummyTrip.muglaTrip,onClickRoadMap,onClickTripStep)
            }
        }
    }
}
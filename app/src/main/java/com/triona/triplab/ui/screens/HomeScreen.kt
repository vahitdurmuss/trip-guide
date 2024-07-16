package com.triona.triplab.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triona.triplab.data.Guider
import com.triona.triplab.data.IstanbulDummyTrip
import com.triona.triplab.data.RizeDummyTrip
import com.triona.triplab.data.Trip
import com.triona.triplab.data.categories
import com.triona.triplab.data.listGuiders
import com.triona.triplab.data.onClickCategory
import com.triona.triplab.data.onClickGuider
import com.triona.triplab.data.onClickTrip
import com.triona.triplab.data.regions
import com.triona.triplab.ui.Categories
import com.triona.triplab.ui.Guiders
import com.triona.triplab.ui.Trips

@Composable
fun HomeScreen(modifier: Modifier) {
    
    Column(modifier=modifier.fillMaxHeight()) {
        TheBestSlot("Trip Types") {
            Categories(list = categories, onClick = onClickCategory )
        }

        TheBestSlot("Regions") {
            Categories(list = regions, onClick = onClickCategory )
        }

        TheBestSlot("Guiders") {
            Guiders(guiders = listGuiders , onClickGuider = onClickGuider )
        }

        TheBestSlot("The Best Trips") {
            Trips(trips = List(10){IstanbulDummyTrip.istanbulTrip}, onClickTrip = onClickTrip)
        }
    }
    
}

@Preview
@Composable
fun PreviewHomeScreen(modifier: Modifier = Modifier) {
    HomeScreen(modifier)
}

@Composable
fun TheBestSlot(header:String,modifier: Modifier = Modifier, content: @Composable (Modifier) -> Unit) {

    Column {
        Text(text =header,modifier=modifier.padding(8.dp,2.dp,2.dp,2.dp))
        content(modifier)
    }

}

@Preview
@Composable
fun PreviewBestSlot(modifier: Modifier = Modifier) {
    TheBestSlot("The Best Trips") {
        Trips(trips = List(10){RizeDummyTrip.rizeTrip}, onClickTrip = onClickTrip)
    }
}


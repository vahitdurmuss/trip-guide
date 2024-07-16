package com.triona.triplab.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.triona.triplab.R
import com.triona.triplab.data.IstanbulDummyTrip
import com.triona.triplab.data.MuglaDummyTrip
import com.triona.triplab.data.RizeDummyTrip
import com.triona.triplab.data.Trip
import com.triona.triplab.data.TripStep
import com.triona.triplab.ui.theme.TripLabTheme

@Composable
fun TripStory(trip: Trip,onClickRoadMap:(Trip)->Unit,onClickTripStep:(TripStep)->Unit, modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(8.dp)) {

        Text(
            text = trip.title,
            fontSize = 22.sp,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )

        Image(
            painter = painterResource(id = R.mipmap.img_woman_traveler),
            contentDescription = "",
            modifier = modifier
                .fillMaxWidth()
                .heightIn(300.dp),
            contentScale = ContentScale.FillWidth
        )


        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = modifier.align(Alignment.End)
        ) {
            IconButton(onClick = { onClickRoadMap(trip) }) {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = "location")
            }
            Text(text = trip.location)
        }


        Spacer(modifier = modifier.heightIn(10.dp))

        Text(text = trip.description, modifier = modifier.padding(8.dp))

        TripStepsInList(tripSteps = trip.steps,onClickTripStep ,modifier = modifier.fillMaxHeight())

    }

}


@Preview
@Composable
fun PreviewTripStory(modifier: Modifier = Modifier) {
    TripLabTheme {
        val onClickTripStep: (TripStep)->Unit ={}
        val onClickRoadMap:(Trip)->Unit={}
        TripStory(MuglaDummyTrip.muglaTrip,onClickRoadMap,onClickTripStep)
    }
}
package com.triona.triplab.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.triona.triplab.R
import com.triona.triplab.data.IstanbulDummyTrip
import com.triona.triplab.data.RizeDummyTrip
import com.triona.triplab.data.Trip
import com.triona.triplab.data.TripStep

@Composable
fun TripStep(tripStep: TripStep, modifier: Modifier = Modifier) {
    Column(modifier=modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = tripStep.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.weight(1f),
                textAlign = TextAlign.Start
            )
            Text(
                text = "${tripStep.startHour}-${tripStep.endHour}",
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                modifier = modifier.weight(1f),
                textAlign = TextAlign.End
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.mipmap.img_woman_traveler),
                contentDescription = "Item Photo",
                modifier = modifier.size(80.dp)
            )
            Text(
                text = tripStep.quickDescription,
                modifier = modifier
                    .paddingFromBaseline(top = 8.dp)
                    .padding(8.dp)
                    .height(72.dp)
            )
        }
    }

}



@Composable
fun TripStepsInList(tripSteps: List<TripStep>, modifier: Modifier = Modifier) {

    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(tripSteps) { tripStep ->
            com.triona.triplab.ui.TripStep(
                tripStep
            )
        }
    }

}

@Composable
fun TripStepsInGrid(steps: List<TripStep>, modifier: Modifier = Modifier) {

    Surface {
        LazyHorizontalGrid(rows = GridCells.Fixed(2)) {
            items(steps){step->
                com.triona.triplab.ui.TripStep(step)
            }
        }
    }
}

@Composable
fun TripItem(tripTitle: String,onClick: () -> Unit, modifier: Modifier = Modifier) {

    Column(modifier=Modifier.clickable { onClick() }, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.mipmap.img_trip_item),
            contentDescription = "TripItem",
            modifier = modifier
                .size(80.dp)
                .clip(RoundedCornerShape(1.dp)),
            contentScale = ContentScale.None
        )
        Text(text = tripTitle, modifier = modifier.paddingFromBaseline(top = 8.dp, bottom = 8.dp))
    }

}

@Composable
fun Trips(trips: List<Trip>, onClickTrip: (Trip) -> Unit, modifier: Modifier = Modifier) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp), contentPadding = PaddingValues(8.dp)
    ) {
        items(trips) { trip ->
            TripItem(tripTitle = trip.title, onClick = { onClickTrip(trip) }, modifier)
        }
    }
}


@Preview
@Composable
fun PreviewTripItem(modifier: Modifier = Modifier) {
    TripItem("Akyaka Turu",onClick = { /*TODO*/ },modifier)
}

@Preview
@Composable
fun PreviewTripStepsInList() {
    TripStepsInList(tripSteps = RizeDummyTrip.rizeTripSteps, modifier = Modifier)
}

@Preview
@Composable
fun PreviewTripStepsInGrid() {
    TripStepsInGrid(steps = RizeDummyTrip.rizeTripSteps, modifier = Modifier)
}

@Preview
@Composable
fun PreviewTrips() {
    val trips = List(10) {
        IstanbulDummyTrip.istanbulTrip
    }
    val onClickTrip: (Trip) -> Unit = {}
    Trips(trips =trips , onClickTrip = onClickTrip)
}


@Preview
@Composable
fun PreviewTripStep() {
    TripStep(
        RizeDummyTrip.rizeTripSteps[0],
        modifier = Modifier
    )
}

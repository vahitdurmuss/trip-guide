package com.triona.triplab.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.triona.triplab.R
import com.triona.triplab.data.Trip
import com.triona.triplab.data.TripStep

@Composable
fun TripStep(whichStep: Int, title: String, description: String, modifier: Modifier = Modifier) {

    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.weight(1f),
                textAlign = TextAlign.Start
            )
            Text(
                text = "10:00-12:00",
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
                text = description,
                modifier = modifier
                    .paddingFromBaseline(top = 8.dp)
                    .padding(8.dp)
                    .height(72.dp)
            )
        }
    }
}


@Composable
fun TripStory(tripSteps: List<TripStep>, modifier: Modifier = Modifier) {

    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(tripSteps) { tripStep ->
            com.triona.triplab.ui.TripStep(
                tripStep.whichStep,
                tripStep.title,
                tripStep.quickDescription
            )
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
fun PreviewTripStory() {
    val tripSteps = List(10) {
        TripStep(
            it,
            "Kahvaltı",
            "Elif Gözlemede taze ve lezzetli bir kahvaltıyla güne başlayabilirsiniz."
        )
    }
    TripStory(tripSteps = tripSteps, modifier = Modifier)
}

@Preview
@Composable
fun PreviewTrips() {
    val trips = List(10) {
        Trip(it, "Akyaka Turu", "32,39", listOf())
    }
    val onClickTrip: (Trip) -> Unit = {}
    Trips(trips =trips , onClickTrip = onClickTrip)
}


@Preview
@Composable
fun PreviewTripStep() {
    TripStep(
        1,
        "Kahvaltı",
        "Elif Gözlemede taze ve lezzetli bir kahvaltıyla güne başlayabilirsiniz.",
        modifier = Modifier
    )
}


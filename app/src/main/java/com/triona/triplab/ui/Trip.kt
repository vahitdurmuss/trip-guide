package com.triona.triplab.ui

import android.graphics.drawable.shapes.RoundRectShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
fun TripItem(tripTitle: String,onClick: () -> Unit, modifier: Modifier = Modifier) {

    Column(modifier=Modifier.clickable { onClick() }, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.mipmap.img_trip_item),
            contentDescription = "TripItem",
            modifier = modifier
                .clip(shape = CircleShape)
                .size(80.dp),
            contentScale = ContentScale.None
        )
        Text(text = tripTitle, modifier = modifier.paddingFromBaseline(top = 8.dp, bottom = 8.dp), maxLines = 2)
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
fun PreviewTrips() {
    val trips = List(10) {
        IstanbulDummyTrip.istanbulTrip
    }
    val onClickTrip: (Trip) -> Unit = {}
    Trips(trips =trips , onClickTrip = onClickTrip)
}


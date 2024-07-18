package com.triona.triplab.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triona.triplab.R
import com.triona.triplab.data.IstanbulDummyTrip
import com.triona.triplab.data.RizeDummyTrip
import com.triona.triplab.data.Trip

@Composable
fun TripItem(trip: Trip, onClick: (Trip) -> Unit, modifier: Modifier = Modifier) {

    Column(modifier = modifier.width(170.dp)) {
        Row(modifier = Modifier
            .clickable { onClick(trip) }
            .fillMaxWidth()) {
            Image(
                painter = painterResource(id = trip.drawable),
                contentDescription = "trip showcase image",
                modifier = modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .clip(shape = MaterialTheme.shapes.large),
                contentScale = ContentScale.None
            )

            Text(
                style = MaterialTheme.typography.titleMedium,
                text = trip.title,
                modifier = modifier
                    .width(100.dp)
                    .height(80.dp)
                    .fillMaxWidth()
                    .padding(8.dp),
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
            )
        }

        Row {
            Box(modifier = modifier.weight(1f)) {
                TripItemIcon(
                    count = 5,
                    drawable = R.drawable.ic_route,
                    imageVector = null,
                    modifier = modifier
                )
            }

            Box {
                TripItemIcon(
                    count = 100,
                    drawable = null,
                    imageVector = Icons.Filled.FavoriteBorder,
                    modifier = modifier
                )
            }
        }

    }

}

@Composable
fun TripItemIcon(
    @DrawableRes drawable: Int?,
    imageVector: ImageVector?,
    count: Int,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.padding(8.dp)
    ) {

        if (imageVector == null) {
            Icon(
                painterResource(id = drawable!!), contentDescription = "route count"
            )
        } else {
            Icon(
                imageVector = imageVector, contentDescription = "like count"
            )
        }
        Text(
            text = "$count", style = MaterialTheme.typography.labelMedium
        )
    }
}


@Composable
fun TripsInLazyRow(trips: List<Trip>, onClickTrip: (Trip) -> Unit, modifier: Modifier = Modifier) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp), contentPadding = PaddingValues(8.dp)
    ) {
        items(trips) { trip ->
            Surface(shadowElevation = 2.dp, shape = MaterialTheme.shapes.small) {
                TripItem(
                    trip = RizeDummyTrip.rizeTrip, onClick = { onClickTrip(trip) }, modifier
                )
            }
        }
    }
}

@Composable
fun TripsInGrid(
    title: String,
    trips: List<Trip>,
    onClickTrip: (Trip) -> Unit,
    modifier: Modifier = Modifier
) {

    Column {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier.padding(8.dp)
        )

        LazyHorizontalGrid(
            rows = GridCells.Fixed(3),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier.heightIn(max = 450.dp)
        ) {
            items(trips) { trip ->
                Surface(shape = MaterialTheme.shapes.small, shadowElevation = 2.dp) {
                    TripItem(trip = trip, onClick = onClickTrip)
                }
            }
        }
    }

}


@Preview
@Composable
fun PreviewTripItem(modifier: Modifier = Modifier) {
    TripItem(RizeDummyTrip.rizeTrip, onClick = { /*TODO*/ }, modifier)
}

@Preview
@Composable
fun PreviewTripItemIcon(modifier: Modifier = Modifier) {
    Column {
        TripItemIcon(
            count = 5, drawable = R.drawable.ic_route, imageVector = null, modifier = modifier
        )

        TripItemIcon(
            count = 100,
            drawable = null,
            imageVector = Icons.Filled.FavoriteBorder,
            modifier = modifier
        )
    }
}

@Preview
@Composable
fun PreviewTrips() {
    val trips = List(10) {
        IstanbulDummyTrip.istanbulTrip
    }
    val onClickTrip: (Trip) -> Unit = {}
    TripsInGrid("Best Trips",trips = trips, onClickTrip = onClickTrip)
}


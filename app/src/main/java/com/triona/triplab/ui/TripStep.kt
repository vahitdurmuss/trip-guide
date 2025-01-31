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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triona.triplab.R
import com.triona.triplab.data.MuglaDummyTrip
import com.triona.triplab.data.RizeDummyTrip
import com.triona.triplab.data.TripStep

@Composable
fun TripStep(tripStep: TripStep, onClickTrip: (TripStep) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .clickable { onClickTrip(tripStep) }
        .padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = tripStep.title,
                modifier = modifier.weight(1f),
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.titleMedium
            )

            Icon(painter = painterResource(id = R.drawable.ic_time), contentDescription = "time")

            Text(
                text = "${tripStep.startTime}-${tripStep.endTime}",
                style = MaterialTheme.typography.labelMedium,
                textAlign = TextAlign.End
            )
        }
        Row(modifier=modifier.padding(top = 8.dp)) {
            Image(
                painter = painterResource(id =tripStep.drawable),
                contentDescription = "Item Photo",
                modifier = modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = ContentScale.None
            )
            Text(
                style = MaterialTheme.typography.bodyMedium,
                text = tripStep.quickDescription,
                modifier = modifier
                    .paddingFromBaseline(top = 8.dp)
                    .padding(8.dp)
                    .height(72.dp),
                maxLines = 3
            )
        }
    }
}

@Composable
fun TripStepsInList(tripSteps: List<TripStep>,onClickTripStep: (TripStep) -> Unit, modifier: Modifier = Modifier) {

    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(tripSteps) { tripStep ->
            Surface(tonalElevation = 2.dp, modifier = modifier.clip(MaterialTheme.shapes.small)) {
                TripStep(
                    tripStep,
                    onClickTripStep
                )
            }
        }
    }

}

@Preview
@Composable
fun PreviewTripStepsInList() {
    TripStepsInList(tripSteps = MuglaDummyTrip.muglaTripSteps,{}, modifier = Modifier)
}

@Preview
@Composable
fun PreviewTripStep() {
    TripStep(
        RizeDummyTrip.rizeTripSteps[0],
        {},
        modifier = Modifier
    )
}
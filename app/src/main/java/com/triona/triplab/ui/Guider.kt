package com.triona.triplab.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triona.triplab.R
import com.triona.triplab.data.Guider
import com.triona.triplab.data.listGuiders
import com.triona.triplab.data.onClickGuider

@Composable
fun GuiderItem(fullName: String, onClick: () -> Unit, modifier: Modifier = Modifier) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .width(60.dp)
            .height(100.dp)
            .clickable { onClick() }) {

        Image(
            painter = painterResource(id = R.mipmap.img_woman_traveler),
            contentDescription = "Profil",
            modifier = modifier
                .paddingFromBaseline(top = 8.dp)
                .size(50.dp)
                .clip(shape = CircleShape)
                .border(width = 1.dp, color = Color.LightGray, shape = CircleShape),
            contentScale = ContentScale.None
        )

        Text(
            text = fullName,
            modifier = Modifier
                .paddingFromBaseline(top = 8.dp, bottom = 4.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodySmall,
            maxLines = 2
        )

    }

}

@Composable
fun Guiders(title:String,guiders: List<Guider>,onClickGuider: (Guider) -> Unit, modifier: Modifier = Modifier) {

    Column {
        Text(text = title,modifier=modifier.padding(8.dp), style = MaterialTheme.typography.titleMedium)
        LazyRow( horizontalArrangement = Arrangement.spacedBy(8.dp), contentPadding = PaddingValues(8.dp), modifier = modifier) {
            items(guiders){ guider->
                Surface(shadowElevation = 2.dp, shape = MaterialTheme.shapes.small) {
                    GuiderItem(
                        fullName = "${guider.name} ${guider.surname}",
                        onClick = { onClickGuider(guider) },
                        modifier
                    )
                }
            }
        }
    }
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun PreviewGuider() {
    GuiderItem(fullName = "Vahit Durmuş",onClick = { /*TODO*/ },Modifier)
}

@Preview
@Composable
fun PreviewGuiders(modifier: Modifier = Modifier) {
    Guiders("Guiders",guiders= listGuiders,onClickGuider=onClickGuider,modifier=Modifier)
}

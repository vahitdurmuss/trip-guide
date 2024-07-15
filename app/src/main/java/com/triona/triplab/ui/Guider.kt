package com.triona.triplab.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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

@Composable
fun GuiderItem(fullName: String, onClick: () -> Unit, modifier: Modifier = Modifier) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .border(1.dp, Color.LightGray, RectangleShape)
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
                .paddingFromBaseline(top = 8.dp, bottom = 16.dp)
                .height(30.dp),
            textAlign = TextAlign.Center
        )

    }

}

@Composable
fun Guiders(guiders: List<Guider>,onClickGuider: (Guider) -> Unit, modifier: Modifier = Modifier) {

    LazyRow( horizontalArrangement = Arrangement.spacedBy(8.dp), contentPadding = PaddingValues(8.dp), modifier = modifier) {
        items(guiders){ guider->
            GuiderItem(fullName ="$guider.name + $guider.surname" , onClick = { onClickGuider(guider) },modifier)
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
    val listGuiders= List(10){Guider(it,"Vahit","Durmuş")}
    val onClickGuider: (Guider) -> Unit = {}
    Guiders(guiders=listGuiders,onClickGuider=onClickGuider,modifier=Modifier)
}
package com.triona.triplab.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val categories= listOf("SeaSide","Beach","Mountain")

@Composable
fun CategoryItem(category:String,onClick: () -> Unit, modifier: Modifier = Modifier) {

    Card(modifier = modifier
        .size(80.dp)
        .clip(RoundedCornerShape(1.dp))
        .clickable { onClick() }) {

        Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxWidth().fillMaxHeight()) {
            Text(text = category, textAlign = TextAlign.Center)
        }

    }
}

@Composable
fun Categories(list:List<String>,onClick: (String) -> Unit,modifier: Modifier = Modifier) {
    LazyRow(contentPadding = PaddingValues(8.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(list){
            CategoryItem(it,onClick = { onClick(it) },modifier)
        }
    }
}

@Preview
@Composable
fun PreviewCategoriesItem(modifier: Modifier = Modifier) {
    CategoryItem("Centrel Anatolia", onClick = {}, modifier)
}

@Preview
@Composable
fun PreviewCategories(modifier: Modifier = Modifier) {
    Categories(list = categories, onClick = {} )
}
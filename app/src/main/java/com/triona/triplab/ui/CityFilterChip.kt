package com.triona.triplab.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triona.triplab.data.cities
import com.triona.triplab.data.onCitySelect
import com.triona.triplab.data.regions

@Composable
fun CityFilterChipsInColumn(title: String, cities: List<String>, modifier: Modifier = Modifier) {
    val selectedCities = remember { mutableStateListOf<String>() }

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        item { Text(text = "Select Cities", style = MaterialTheme.typography.titleMedium) }
        item { Spacer(modifier = Modifier.height(8.dp)) }

        items(cities) { city ->
            FilterChip(selected = selectedCities.contains(city), onClick = {
                if (selectedCities.contains(city)) {
                    selectedCities.remove(city)
                } else {
                    selectedCities.add(city)
                }
            }, label = { Text(text = city) })

        }

    }
}

@Composable
fun FilterChipsInLazyRow(
    title: String,
    list: List<String>,
    onCitySelected: (List<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    val selectedCities = remember { mutableStateListOf<String>() }

    Column {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier.padding(8.dp)
        )

        LazyRow(
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(list) { city ->
                FilterChip(selected = selectedCities.contains(city), onClick = {
                    if (selectedCities.contains(city)) {
                        selectedCities.remove(city)
                    } else {
                        selectedCities.add(city)
                    }
                    onCitySelected(list)
                }, label = { Text(text = city) })

            }

        }
    }
}

@Composable
fun CityFilterChipsInGrid(
    cities: List<String>,
    onCitySelected: (List<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    val selectedCities = remember { mutableStateListOf<String>() }

    Column(
        modifier = modifier
            .height(400.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Select Cities",
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier.padding(8.dp)
        )
        Spacer(modifier = modifier.height(8.dp))

        LazyHorizontalGrid(
            rows = GridCells.Fixed(5),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(cities) { city ->
                FilterChip(selected = selectedCities.contains(city), onClick = {
                    if (selectedCities.contains(city)) {
                        selectedCities.remove(city)
                    } else {
                        selectedCities.add(city)
                    }
                    onCitySelected(selectedCities.toList())
                }, label = { Text(text = city) }, modifier = modifier.width(100.dp))
            }
        }

    }
}

@Preview
@Composable
fun PreviewCityFilterChips(modifier: Modifier = Modifier) {
    FilterChipsInLazyRow(title = "Trip Types", list = regions, onCitySelected = onCitySelect)
}
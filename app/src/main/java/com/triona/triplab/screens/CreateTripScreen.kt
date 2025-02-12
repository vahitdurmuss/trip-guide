package com.triona.triplab.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CreateTripScreen(onNext: (String, String, String) -> Unit) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Yeni Seyahat Oluştur", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Seyahat Başlığı") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Açıklama") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = location,
            onValueChange = { location = it },
            label = { Text("Konum") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onNext(title, description, location) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "İleri")
        }
    }
}

@Composable
fun CreateTripStepScreen(onStepAdded: (String, String, String, String, String, String, String) -> Unit) {
    var title by remember { mutableStateOf("") }
    var quickDescription by remember { mutableStateOf("") }
    var detailedDescription by remember { mutableStateOf("") }
    var startTime by remember { mutableStateOf("") }
    var endTime by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Yeni Adım Ekle", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Başlık") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = quickDescription, onValueChange = { quickDescription = it }, label = { Text("Kısa Açıklama") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = detailedDescription, onValueChange = { detailedDescription = it }, label = { Text("Detaylı Açıklama") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = startTime, onValueChange = { startTime = it }, label = { Text("Başlangıç Saati") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = endTime, onValueChange = { endTime = it }, label = { Text("Bitiş Saati") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = date, onValueChange = { date = it }, label = { Text("Tarih") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = location, onValueChange = { location = it }, label = { Text("Konum") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onStepAdded(title, quickDescription, detailedDescription, startTime, endTime, date, location) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Adımı Ekle")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCreateTripScreen() {
    CreateTripScreen { _, _, _ -> }
}

@Preview(showBackground = true)
@Composable
fun PreviewCreateTripStepScreen() {
    CreateTripStepScreen { _, _, _, _, _, _, _ -> }
}

package com.triona.triplab.data

val listGuiders = List(10) { Guider(it, "Vahit", "Durmuş") }
val trips = List(10) {
    Trip(it, "Akyaka Turu", "32,39", listOf())
}
val categories = listOf("SeaSide", "Beach", "Mountain")
val regions= listOf("Marmara", "Aegean", "Black Sea", "Central Anatolia", "Eastern Anatolia", "Southeastern Anatolia", "Mediterranean")

val onClickTrip: (Trip) -> Unit = {}
val onClickCategory: (String) -> Unit = {}
val onClickGuider: (Guider) -> Unit = {}
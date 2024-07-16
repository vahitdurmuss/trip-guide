package com.triona.triplab.data

val listGuiders = List(10) { Guider(it, "Vahit", "Durmuş") }

val categories = listOf("SeaSide", "Beach", "Mountain")
val regions= listOf("Marmara", "Aegean", "Black Sea", "Central Anatolia", "Eastern Anatolia", "Southeastern Anatolia", "Mediterranean")

val onClickTrip: (Trip) -> Unit = {}
val onClickCategory: (String) -> Unit = {}
val onClickGuider: (Guider) -> Unit = {}

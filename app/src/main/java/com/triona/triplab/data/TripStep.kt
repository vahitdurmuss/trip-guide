package com.triona.triplab.data

data class TripStep(
    val whichStep: Int,
    val title: String,
    val quickDescription: String,
    val detailedDescription: String = "",
    val location: String = "32,39",
    val photo:String=""
)

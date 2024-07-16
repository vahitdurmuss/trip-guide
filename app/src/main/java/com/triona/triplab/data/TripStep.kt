package com.triona.triplab.data

import java.util.Date

data class TripStep(
    val title: String,
    val quickDescription: String,
    val detailedDescription: String = "",
    val startHour:Int,
    val endHour:Int,
    val date:String,
    val location: String = "32,39",
    val photo:String=""
)

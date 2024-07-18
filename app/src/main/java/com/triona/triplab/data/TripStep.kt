package com.triona.triplab.data

data class TripStep(
    val title: String,
    val quickDescription: String,
    val detailedDescription: String,
    val startHour:Int,
    val endHour:Int,
    val date:String,
    val location: String,
    val photo:String
)

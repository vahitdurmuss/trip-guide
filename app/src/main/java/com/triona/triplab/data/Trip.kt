package com.triona.triplab.data

data class Trip(val id:Int,val title:String,val location:String, val steps: List<TripStep>)

package com.triona.triplab.data

import androidx.annotation.DrawableRes
import com.triona.triplab.R

data class TripStep(
    val title: String,
    val quickDescription: String,
    val detailedDescription: String,
    val startHour:Int,
    val endHour:Int,
    val date:String,
    val location: String,
    val photo:String,
    @DrawableRes val drawable:Int= R.mipmap.img_bodrum_aksam_yemegi,
)

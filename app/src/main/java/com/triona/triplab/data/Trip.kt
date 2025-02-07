package com.triona.triplab.data

import androidx.annotation.DrawableRes
import com.triona.triplab.R

data class Trip(
    val id: Int,
    val guiderId:Int,
    val likeCount: Int,
    val title: String,
    val description: String,
    val location: String,
    @DrawableRes val drawable: Int = R.mipmap.ic_mugla_seruven,
    val steps: List<TripStep>
)

package com.triona.triplab.data.room.city

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.triona.triplab.data.room.location.Location


@Entity(
    tableName = "cities",
    foreignKeys = [
        ForeignKey(
            entity = Location::class,
            parentColumns = ["id"],
            childColumns = ["location_id"],
            onDelete = ForeignKey.SET_NULL
        )
    ]
)
data class City(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("city_name") val name: String,
    @ColumnInfo("location_id") val locationId: Int?
)
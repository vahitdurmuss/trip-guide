package com.triona.triplab.data.room.location

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName ="locations")
data class Location(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("location_name") val name: String?,
    val latitude: Double,
    val longitude: Double
)
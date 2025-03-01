package com.triona.triplab.data.room.region

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.triona.triplab.data.room.city.City


@Entity(
    tableName = "regions",
    foreignKeys = [
        ForeignKey(
            entity = City::class,
            parentColumns = ["id"],
            childColumns = ["center_location_city_id"],
            onDelete = ForeignKey.NO_ACTION
        )]
)
data class Region(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("region_name") val regionName: String,
    @ColumnInfo("center_location_city_id") val centerLocationCityId: Int?
)
package com.triona.triplab.data.room.guider

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.triona.triplab.data.room.city.City
import com.triona.triplab.data.room.region.Region
import com.triona.triplab.data.room.user.User

@Entity(
    tableName = "guiders",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["guider_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Region::class,
            parentColumns = ["id"],
            childColumns = ["region_id"],
            onDelete = ForeignKey.SET_NULL
        ),
        ForeignKey(
            entity = City::class,
            parentColumns = ["id"],
            childColumns = ["city_id"],
            onDelete = ForeignKey.SET_NULL
        )
    ]
)
data class Guider(
    @ColumnInfo("guider_id") @PrimaryKey val guiderId: Int, // User's ID
    @ColumnInfo("quick_bio") val quickBio: String,
    @ColumnInfo("detailed_bio") val detailedBio: String,
    @ColumnInfo("region_id") val regionId: Int?, // Nullable because a Guider might not have a region yet
    @ColumnInfo("city_id") val cityId: Int? // Nullable because a Guider might not have a city yet
)
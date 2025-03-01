package com.triona.triplab.data.room.trip

import android.graphics.Region
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.triona.triplab.data.room.category.Category
import com.triona.triplab.data.room.city.City
import com.triona.triplab.data.room.guider.Guider
import com.triona.triplab.data.room.location.Location


@Entity(
    tableName = "trips",
    foreignKeys = [
        ForeignKey(
            entity = Guider::class,
            parentColumns = ["id"],
            childColumns = ["guider_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Location::class,
            parentColumns = ["id"],
            childColumns = ["location_id"],
            onDelete = ForeignKey.SET_NULL
        ),
        ForeignKey(
            entity = City::class,
            parentColumns = ["id"],
            childColumns = ["city_id"],
            onDelete = ForeignKey.SET_NULL
        ),
        ForeignKey(
            entity = Region::class,
            parentColumns = ["id"],
            childColumns = ["region_id"],
            onDelete = ForeignKey.SET_NULL
        ),
        ForeignKey(
            entity = Category::class,
            parentColumns = ["id"],
            childColumns = ["category_id"],
            onDelete = ForeignKey.SET_NULL
        )
    ]
)
data class Trip(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("guider_id") val guiderId: Int,
    @ColumnInfo("like_count") val likeCount: Int = 0, // Default to 0 likes
    @ColumnInfo("trip_title") val tripTitle: String,
    @ColumnInfo("trip_description") val tripDescription: String,
    @ColumnInfo("location_id") val locationId: Int?, // Nullable because a trip might not have a specific location
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB) val photo: ByteArray?, // Nullable because a trip might not have a photo
    @ColumnInfo("city_id") val cityId: Int?, // Nullable because a trip might not have a specific city
    @ColumnInfo("region_id") val regionId: Int?, // Nullable because a trip might not have a specific region
    @ColumnInfo("category_id") val categoryId: Int? // Nullable because a trip might not have a specific category
)
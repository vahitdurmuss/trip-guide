package com.triona.triplab.data.room.step

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.triona.triplab.data.room.location.Location
import java.time.LocalDate
import java.time.LocalTime


@Entity(
    tableName = "steps",
    foreignKeys = [
        ForeignKey(
            entity = Location::class,
            parentColumns = ["id"],
            childColumns = ["location_id"],
            onDelete = ForeignKey.SET_NULL
        )
    ]
)
data class Step(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("step_title") val stepTitle: String,
    @ColumnInfo("quick_description") val quickDescription: String,
    @ColumnInfo("detailed_description") val detailedDescription: String,
    @ColumnInfo("start_time") val startTime: LocalTime?,
    @ColumnInfo("end_time") val endTime: LocalTime?,
    @ColumnInfo("date") val date: LocalDate,
    @ColumnInfo("location_id") val locationId: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB) val photo: ByteArray?, // Nullable because a step might not have a photo
    @ColumnInfo("like_count") val likeCount: Int = 0 // Default to 0 likes
)
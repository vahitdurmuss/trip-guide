package com.triona.triplab.data.room.tripStep

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.triona.triplab.data.room.step.Step
import com.triona.triplab.data.room.trip.Trip


@Entity(
    tableName = "trip_steps",
    foreignKeys = [
        ForeignKey(
            entity = Step::class,
            parentColumns = ["id"],
            childColumns = ["step_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Trip::class,
            parentColumns = ["id"],
            childColumns = ["trip_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["step_id", "trip_id"], unique = true)
    ]
)
data class TripStep(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("step_id") val stepId: Int,
    @ColumnInfo("trip_id") val tripId: Int,
    @ColumnInfo("step_number") val stepNumber:Int
)
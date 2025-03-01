package com.triona.triplab.data.room.tripStep

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface TripStepDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(tripStep: TripStep)

    @Update
    suspend fun update(tripStep: TripStep)

    @Delete
    suspend fun delete(tripStep: TripStep)

    @Query("SELECT * FROM trip_steps WHERE id = :id")
    fun getTripStep(id: Int): Flow<TripStep>

    @Query("SELECT * FROM trip_steps WHERE trip_id = :tripId")
    fun getTripStepsByTrip(tripId: Int): Flow<List<TripStep>>

    @Query("SELECT * FROM trip_steps WHERE step_id = :stepId")
    fun getTripByStep(stepId: Int): Flow<List<TripStep>>

    @Query("SELECT * FROM trip_steps")
    fun getAllTripSteps(): Flow<List<TripStep>>
}
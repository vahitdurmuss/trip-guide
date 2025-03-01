package com.triona.triplab.data.room.step

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface StepDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(step: Step)

    @Update
    suspend fun update(step: Step)

    @Delete
    suspend fun delete(step: Step)

    @Query("SELECT * FROM steps WHERE id = :id")
    fun getStep(id: Int): Flow<Step>

    @Query("SELECT * FROM steps WHERE location_id = :locationId")
    fun getStepsByLocation(locationId: Int): Flow<List<Step>>

    @Query("SELECT * FROM steps ORDER BY date ASC, start_time ASC")
    fun getAllSteps(): Flow<List<Step>>
}
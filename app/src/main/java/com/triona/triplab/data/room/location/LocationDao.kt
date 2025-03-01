package com.triona.triplab.data.room.location

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(location: Location)

    @Update
    suspend fun update(location: Location)

    @Delete
    suspend fun delete(location: Location)

    @Query("SELECT * FROM locations WHERE id = :id")
    fun getLocation(id: Int): Flow<Location>

    @Query("SELECT * FROM locations ORDER BY location_name ASC")
    fun getAllLocations(): Flow<List<Location>>
}
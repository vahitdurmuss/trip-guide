package com.triona.triplab.data.room.region

import android.graphics.Region
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface RegionDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(region: Region)

    @Update
    suspend fun update(region: Region)

    @Delete
    suspend fun delete(region: Region)

    @Query("SELECT * FROM regions WHERE id = :id")
    fun getRegion(id: Int): Flow<Region>

    @Query("SELECT * FROM regions ORDER BY region_name ASC")
    fun getAllRegions(): Flow<List<Region>>
}
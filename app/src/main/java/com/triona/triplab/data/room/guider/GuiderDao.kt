package com.triona.triplab.data.room.guider

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface GuiderDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(guider: Guider)

    @Update
    suspend fun update(guider: Guider)

    @Delete
    suspend fun delete(guider: Guider)

    @Query("SELECT * FROM guiders WHERE city_id = :id")
    fun getGuider(id: Int): Flow<Guider>

    @Query("SELECT * FROM guiders WHERE region_id = :regionId")
    fun getGuidersByRegion(regionId: Int): Flow<List<Guider>>

    @Query("SELECT * FROM guiders WHERE city_id = :cityId")
    fun getGuidersByCity(cityId: Int): Flow<List<Guider>>

    @Query("SELECT * FROM guiders")
    fun getAllGuiders(): Flow<List<Guider>>
}
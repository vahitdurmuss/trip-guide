package com.triona.triplab.data.room.city

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface CityDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(city: City)

    @Update
    suspend fun update(city: City)

    @Delete
    suspend fun delete(city: City)

    @Query("SELECT * FROM cities WHERE id = :id")
    fun getCity(id: Int): Flow<City>

    @Query("SELECT * FROM cities WHERE location_id = :locationId")
    fun getCitiesByLocation(locationId: Int): Flow<List<City>>

    @Query("SELECT * FROM cities ORDER BY city_name ASC")
    fun getAllCities(): Flow<List<City>>
}
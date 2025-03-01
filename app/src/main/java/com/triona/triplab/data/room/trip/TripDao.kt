package com.triona.triplab.data.room.trip

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TripDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(trip: Trip)

    @Update
    suspend fun update(trip: Trip)

    @Delete
    suspend fun delete(trip: Trip)

    @Query("SELECT * FROM trips WHERE id = :id")
    fun getTrip(id: Int): Flow<Trip>

    @Query("SELECT * FROM trips WHERE guider_id = :guiderId")
    fun getTripsByGuider(guiderId: Int): Flow<List<Trip>>

    @Query("SELECT * FROM trips WHERE location_id = :locationId")
    fun getTripsByLocation(locationId: Int): Flow<List<Trip>>

    @Query("SELECT * FROM trips WHERE city_id = :cityId")
    fun getTripsByCity(cityId: Int): Flow<List<Trip>>

    @Query("SELECT * FROM trips WHERE region_id = :regionId")
    fun getTripsByRegion(regionId: Int): Flow<List<Trip>>

    @Query("SELECT * FROM trips WHERE category_id = :categoryId")
    fun getTripsByCategory(categoryId: Int): Flow<List<Trip>>

    @Query("SELECT * FROM trips ORDER BY trip_title ASC")
    fun getAllTrips(): Flow<List<Trip>>
}
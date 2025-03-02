package com.triona.triplab.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.triona.triplab.data.Guider
import com.triona.triplab.data.Trip
import com.triona.triplab.data.TripStep
import com.triona.triplab.data.room.category.Category
import com.triona.triplab.data.room.category.CategoryDao
import com.triona.triplab.data.room.city.City
import com.triona.triplab.data.room.city.CityDao
import com.triona.triplab.data.room.guider.GuiderDao
import com.triona.triplab.data.room.location.Location
import com.triona.triplab.data.room.location.LocationDao
import com.triona.triplab.data.room.region.Region
import com.triona.triplab.data.room.region.RegionDao
import com.triona.triplab.data.room.step.Step
import com.triona.triplab.data.room.step.StepDao
import com.triona.triplab.data.room.trip.TripDao
import com.triona.triplab.data.room.tripStep.TripStepDao
import com.triona.triplab.data.room.user.User

@Database(
    entities = [
        User::class,
        Category::class,
        City::class,
        Guider::class,
        Location::class,
        Region::class,
        Step::class,
        Trip::class,
        TripStep::class
    ],
    version = 1,
    exportSchema = true
)

@TypeConverters(Converters::class)
abstract class TripGuiderDatabase : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao
    abstract fun cityDao(): CityDao
    abstract fun guiderDao(): GuiderDao
    abstract fun locationDao(): LocationDao
    abstract fun regionDao(): RegionDao
    abstract fun stepDao(): StepDao
    abstract fun tripDao(): TripDao
    abstract fun tripStepDao(): TripStepDao
}
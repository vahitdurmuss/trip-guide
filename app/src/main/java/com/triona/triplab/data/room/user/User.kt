package com.triona.triplab.data.room.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("user_name") val name: String,
    @ColumnInfo("user_surname") val surname: String,
    @ColumnInfo(name = "profile_photo",typeAffinity = ColumnInfo.BLOB) val profilePhoto: ByteArray?,
    @ColumnInfo("user_age") val age: Int,
    @ColumnInfo("user_gender") val gender: String
)
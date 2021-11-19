package com.example.testasia.mvp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class Photos(
    @PrimaryKey(autoGenerate = true)
    val id:Int? = null,
    val photo: String,
    val date:String
)

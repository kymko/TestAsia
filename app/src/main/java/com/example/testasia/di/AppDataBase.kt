package com.example.testasia.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testasia.mvp.model.PhotoDao
import com.example.testasia.mvp.model.Photos

@Database(
    entities = [Photos::class],
    version = 1,
    exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {

    abstract fun photoDao(): PhotoDao
}
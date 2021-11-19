package com.example.testasia.mvp.model

import androidx.lifecycle.LiveData
import androidx.room.*
import dagger.Provides

@Dao
interface PhotoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPic(note: Photos)

    @Query("SELECT * FROM photos")
    fun getAllPic():LiveData<List<Photos>>

    @Delete
    fun delete(photos: Photos)

}
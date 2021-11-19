package com.example.testasia.di

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.testasia.CameraApp
import com.example.testasia.mvp.model.PhotoDao
import com.example.testasia.mvp.model.Photos
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DaoModule {



        @Provides
        @Singleton
        fun provideDao(dao: PhotoDao): PhotoDao {
            return dao
        }


        @Provides
        @Singleton
        fun provideApplication(app: CameraApp): Context = app

}
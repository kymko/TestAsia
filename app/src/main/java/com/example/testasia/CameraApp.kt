package com.example.testasia

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.room.DatabaseConfiguration
import com.example.testasia.di.AppComponent
import com.example.testasia.di.DaggerAppComponent
import com.example.testasia.di.DaoModule
import dagger.internal.DaggerCollections

class CameraApp : Application() {

    companion object {
        lateinit var graph: AppComponent

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()

        context = this

        graph = DaggerAppComponent.builder().daoModule(DaoModule()).build()



//        graph = DaggerAppComponent.builder().noteDaoModule(NoteDaoModule()).build()

//        val appDatabaseConfig = DatabaseConfig.Builder(AppDatabase::class.java)
//            .addModelClasses(Note::class.java)
//            .build()
//
//        ReActiveAndroid.init(ReActiveConfig.Builder(this)
//            .addDatabaseConfigs(appDatabaseConfig)
//            .build())


    }
}
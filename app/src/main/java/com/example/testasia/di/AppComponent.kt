package com.example.testasia.di

import com.example.testasia.mvp.presenter.CameraPresenter
import com.example.testasia.mvp.presenter.PhotoPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DaoModule::class])
interface AppComponent {
    fun inject(cameraPresenter: CameraPresenter)

    fun inject(photoPresenter: PhotoPresenter)

    
}
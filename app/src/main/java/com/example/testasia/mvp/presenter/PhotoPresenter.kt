package com.example.testasia.mvp.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.testasia.CameraApp
import com.example.testasia.mvp.model.PhotoDao
import com.example.testasia.mvp.model.Photos
import com.example.testasia.mvp.views.PhotoView
import javax.inject.Inject

@InjectViewState
class PhotoPresenter @Inject constructor(val dao: PhotoDao)  : MvpPresenter<PhotoView>() {

    private lateinit var photoList: LiveData<List<Photos>>

    init {
        CameraApp.graph.inject(this)
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        loadAllPhotos()
    }

    private fun loadAllPhotos(){
       photoList = dao.getAllPic()
        viewState.onPhotosLoaded()
    }

}
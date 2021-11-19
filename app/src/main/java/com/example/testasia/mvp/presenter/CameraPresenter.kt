package com.example.testasia.mvp.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.testasia.CameraApp
import com.example.testasia.mvp.model.PhotoDao
import com.example.testasia.mvp.model.Photos
import com.example.testasia.mvp.views.CameraView
import javax.inject.Inject

@InjectViewState
class CameraPresenter @Inject constructor(val dao: PhotoDao) : MvpPresenter<CameraView>() {

    init {
        CameraApp.graph.inject(this)
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }

    fun savePic(data: Photos) {
        viewState.savePic(data)
        dao.insertPic(data)

    }

}
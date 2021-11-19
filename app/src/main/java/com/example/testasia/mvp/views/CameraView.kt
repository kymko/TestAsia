package com.example.testasia.mvp.views

import com.arellomobile.mvp.MvpView
import com.example.testasia.mvp.model.Photos

interface CameraView: MvpView {

    fun savePic(data: Photos)

}
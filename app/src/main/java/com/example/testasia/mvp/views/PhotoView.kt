package com.example.testasia.mvp.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.testasia.mvp.model.Photos

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface PhotoView :MvpView {

    fun onPhotosLoaded()


}
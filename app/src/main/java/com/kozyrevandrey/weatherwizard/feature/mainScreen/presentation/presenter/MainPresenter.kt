package com.kozyrevandrey.weatherwizard.feature.mainScreen.presentation.presenter

import com.kozyrevandrey.weatherwizard.core.presentation.navigation.GlobalRouter
import com.kozyrevandrey.weatherwizard.core.presentation.presenter.BasePresenter
import com.kozyrevandrey.weatherwizard.feature.mainScreen.presentation.view.MainView
import moxy.InjectViewState
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(private val router: GlobalRouter) : BasePresenter<MainView>() {
}
package com.kozyrevandrey.weatherwizard.feature

import com.kozyrevandrey.weatherwizard.core.presentation.navigation.GlobalRouter
import com.kozyrevandrey.weatherwizard.core.presentation.presenter.BasePresenter
import moxy.InjectViewState
import javax.inject.Inject

@InjectViewState
class RootPresenter @Inject constructor(private val router: GlobalRouter) : BasePresenter<RootView>(){

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        dealWithNavigation()
    }

    private fun dealWithNavigation(){
        router.navigateToMainScreen()
    }
}
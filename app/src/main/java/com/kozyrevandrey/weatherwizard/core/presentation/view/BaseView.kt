package com.kozyrevandrey.weatherwizard.core.presentation.view

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface BaseView: MvpView, ProgressView, ErrorView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun hideKeyboard()
}
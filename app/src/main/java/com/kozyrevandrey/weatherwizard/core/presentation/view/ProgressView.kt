package com.kozyrevandrey.weatherwizard.core.presentation.view

import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

interface ProgressView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showProgressBar()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun hideProgressBar()
}
package com.kozyrevandrey.weatherwizard.core.presentation.view

import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface ErrorView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showError(
        errorMessage: String,
        stringIdPositiveButton: Int,
        dismissAction: () -> Unit
    )
}
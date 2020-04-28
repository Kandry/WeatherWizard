package com.kozyrevandrey.weatherwizard.feature.mainScreen

import androidx.fragment.app.Fragment
import com.kozyrevandrey.weatherwizard.feature.mainScreen.presentation.view.MainFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class MainScreen: SupportAppScreen() {

    override fun getFragment(): Fragment =MainFragment.getInstance()
}
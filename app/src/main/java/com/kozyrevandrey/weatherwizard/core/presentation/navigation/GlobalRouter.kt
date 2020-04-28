package com.kozyrevandrey.weatherwizard.core.presentation.navigation

import com.kozyrevandrey.weatherwizard.feature.mainScreen.MainScreen
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.commands.Back
import javax.inject.Inject

class GlobalRouter @Inject constructor(): Router() {

    fun back(){
        executeCommands(Back())
    }

    fun navigateToMainScreen(){
        newRootScreen(MainScreen())
    }
}
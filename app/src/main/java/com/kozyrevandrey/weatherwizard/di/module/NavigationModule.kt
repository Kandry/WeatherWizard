package com.kozyrevandrey.weatherwizard.di.module

import com.kozyrevandrey.weatherwizard.core.presentation.navigation.GlobalRouter
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import javax.inject.Singleton

@Module
class NavigationModule {

    @Singleton
    @Provides
    fun provideGlobalRouter(): GlobalRouter = GlobalRouter()

    @Singleton
    @Provides
    fun provideCicerone(ciceroneRouter: GlobalRouter): Cicerone<GlobalRouter> {
        return Cicerone.create(ciceroneRouter)
    }

    @Singleton
    @Provides
    fun provideNavigatorHolder(cicerone: Cicerone<GlobalRouter>): NavigatorHolder {
        return cicerone.navigatorHolder
    }
}
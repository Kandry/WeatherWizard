package com.kozyrevandrey.weatherwizard.di.module

import com.kozyrevandrey.weatherwizard.feature.mainScreen.presentation.view.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}
package com.kozyrevandrey.weatherwizard.di.module

import com.kozyrevandrey.weatherwizard.feature.RootActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeRootActivity(): RootActivity
}
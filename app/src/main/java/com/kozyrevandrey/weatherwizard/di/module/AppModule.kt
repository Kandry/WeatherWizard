package com.kozyrevandrey.weatherwizard.di.module

import android.content.Context
import com.kozyrevandrey.weatherwizard.di.app.WeatherWizardApp
import com.kozyrevandrey.weatherwizard.utils.ResourceProvider
import com.kozyrevandrey.weatherwizard.utils.ResourceProviderImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideAppContext(weatherWizardApp: WeatherWizardApp): Context = weatherWizardApp.applicationContext

    @Singleton
    @Provides
    fun provideResourceProvider(context: Context): ResourceProvider = ResourceProviderImpl(context)
}
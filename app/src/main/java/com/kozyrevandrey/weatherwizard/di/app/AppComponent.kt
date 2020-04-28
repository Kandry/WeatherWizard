package com.kozyrevandrey.weatherwizard.di.app

import com.kozyrevandrey.weatherwizard.di.module.ActivityModule
import com.kozyrevandrey.weatherwizard.di.module.AppModule
import com.kozyrevandrey.weatherwizard.di.module.FragmentsModule
import com.kozyrevandrey.weatherwizard.di.module.NavigationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        NavigationModule::class,
        ActivityModule::class,
        FragmentsModule::class
    ]
)
@Singleton
interface AppComponent: AndroidInjector<WeatherWizardApp> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: WeatherWizardApp): Builder

        fun build(): AppComponent
    }
}
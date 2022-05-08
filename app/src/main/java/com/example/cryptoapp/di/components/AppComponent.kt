package com.example.cryptoapp.di.components

import com.example.cryptoapp.App
import com.example.cryptoapp.di.modules.AppModule
import com.example.cryptoapp.di.modules.HomeModule
import com.example.cryptoapp.di.modules.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        HomeModule::class,
        ViewModelFactoryModule::class,
        AndroidInjectionModule::class
    ]
)
interface AppComponent : AndroidInjector<App>{

    override fun inject(instance: App)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

}


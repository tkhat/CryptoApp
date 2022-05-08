package com.example.cryptoapp.di.modules

import com.example.cryptoapp.common.NavigationController
import com.example.cryptoapp.common.NavigationControllerImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class NavigationModule {

    @Singleton
    @Binds
    abstract fun bindsNavigationController(
        navigationController: NavigationControllerImpl
    ): NavigationController
}
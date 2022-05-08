package com.example.cryptoapp.di.modules

import androidx.lifecycle.ViewModelProvider
import com.example.cryptoapp.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):
            ViewModelProvider.Factory
}
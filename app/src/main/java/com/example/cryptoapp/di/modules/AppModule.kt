package com.example.cryptoapp.di.modules

import android.content.ComponentName
import android.content.Context
import com.example.cryptoapp.App
import com.example.cryptoapp.di.qualifers.HomeActivityComponent
import com.example.cryptoapp.MainActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplicationContext(application: App): Context = application

    @Provides
    @Singleton
    @HomeActivityComponent
    fun provideHomeActivityComponent(context: Context): ComponentName =
        ComponentName(context, MainActivity::class.java)
}
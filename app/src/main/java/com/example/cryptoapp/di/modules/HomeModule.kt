package com.example.cryptoapp.di.modules

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.di.ViewModelKey
import com.example.cryptoapp.MainActivity
import com.example.cryptoapp.presentation.dashboard.DashboardFragment
import com.example.cryptoapp.presentation.dashboard.DashboardViewModel
import com.example.cryptoapp.presentation.portfolio.PortfolioFragment
import com.example.cryptoapp.presentation.prices.PricesFragment
import com.example.cryptoapp.presentation.profile.ProfileFragment
import com.example.cryptoapp.presentation.trade.TradeFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun contributePortfolioFragment(): PortfolioFragment

    @ContributesAndroidInjector
    abstract fun contributeTradeFragment(): TradeFragment

    @ContributesAndroidInjector
    abstract fun contributeProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun contributePricesFragment(): PricesFragment

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindHomeViewModel(
        viewModel: DashboardViewModel
    ): ViewModel

}
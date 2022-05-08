package com.example.cryptoapp.common

import android.os.Bundle

sealed class NavigationEvent {

    object OpenDashboard : NavigationEvent()

    object OpenPortfolio : NavigationEvent()

    object OpenTrade : NavigationEvent()

    object OpenPrices : NavigationEvent()

    object OpenProfile : NavigationEvent()

}
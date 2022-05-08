package com.example.cryptoapp.common

import android.util.ArrayMap
import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import com.example.cryptoapp.common.helper.SingleLiveEvent
import javax.inject.Inject

interface NavigationController {

    fun <T : NavigationEvent> navigate(event: T)

    @MainThread
    fun <T : NavigationEvent> observeNavigationEvent(
        lifecycleOwner: LifecycleOwner,
        eventClass: Class<T>,
        eventObserver: (event: T) -> Unit
    )

    @MainThread
    fun <T : NavigationEvent> removeNavigationEventObservers(
        lifecycleOwner: LifecycleOwner,
        eventClass: Class<T>
    )

}

class NavigationControllerImpl @Inject constructor() : NavigationController {

    private val events: MutableMap<Class<out NavigationEvent>, SingleLiveEvent<out NavigationEvent>> =
        ArrayMap()


    @MainThread
    @Suppress("UNCHECKED_CAST")
    override fun <T : NavigationEvent> observeNavigationEvent(
        lifecycleOwner: LifecycleOwner,
        eventClass: Class<T>,
        eventObserver: (event: T) -> Unit,
    ) {
        events.getOrPut(eventClass) { SingleLiveEvent<T>() }
            .let { it as SingleLiveEvent<T> }
            .observe(lifecycleOwner, { event -> event?.let(eventObserver) })
    }

    override fun <T : NavigationEvent> removeNavigationEventObservers(
        lifecycleOwner: LifecycleOwner,
        eventClass: Class<T>,
    ) {
        events[eventClass]?.removeObservers(lifecycleOwner)
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : NavigationEvent> navigate(event: T) {
        events.getOrPut(event::class.java) { SingleLiveEvent<T>()}
            .let { it as SingleLiveEvent<T> }
            .value = event
    }

}

@MainThread
inline fun <reified T : NavigationEvent> NavigationController.observeNavigationEvent(
    lifecycleOwner: LifecycleOwner,
    noinline eventObserver: (event: T) -> Unit,
) = observeNavigationEvent(lifecycleOwner, T::class.java, eventObserver)



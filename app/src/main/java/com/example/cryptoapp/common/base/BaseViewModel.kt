package com.example.cryptoapp.common.base

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.PublishSubject

abstract class BaseViewModel : ViewModel() {

    protected val disposables = CompositeDisposable()
    private val onRefreshSubject = PublishSubject.create<Int>()

    @CallSuper
    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }



    fun onRefresh(requestCode: Int = RC_SWIPE_REFRESH) {
        onRefreshSubject.onNext(requestCode)
    }

    protected fun onInit(): Observable<Int> {
        return Observable.just(RC_INIT)
    }

    protected fun onRefresh(): Observable<Int> {
        return onRefreshSubject
    }

    protected fun Disposable.bindToLifecycle() = apply {
        disposables.add(this)
    }

    companion object {
        const val RC_INIT = 1
        const val RC_SWIPE_REFRESH = 2
        const val RC_LOAD_MORE = 3
        const val RC_LOAD_WITH_FILTERS = 4
        const val RC_SEARCH = 5
        const val RC_RELOAD = 6
    }

}
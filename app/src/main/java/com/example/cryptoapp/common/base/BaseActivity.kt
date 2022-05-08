package com.example.cryptoapp.common.base

import android.os.Bundle
import androidx.annotation.CallSuper
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity: DaggerAppCompatActivity() {

    @Inject
    lateinit var noOpObject: DaggerFix1



}


class DaggerFix1 @Inject constructor()
package com.example.cryptoapp

import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.cryptoapp.common.NavigationController
import com.example.cryptoapp.common.base.BaseActivity
import com.example.cryptoapp.databinding.ActivityMainBinding
import com.example.cryptoapp.di.ViewModelFactory
import com.example.cryptoapp.presentation.dashboard.DashboardViewModel
import com.google.android.material.internal.NavigationMenu
import com.google.android.material.internal.NavigationMenuItemView
import com.google.android.material.internal.NavigationMenuView
import javax.inject.Inject

class MainActivity : BaseActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: DashboardViewModel by viewModels {viewModelFactory}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        binding.navView.setupWithNavController(navController.navController)


    }
}
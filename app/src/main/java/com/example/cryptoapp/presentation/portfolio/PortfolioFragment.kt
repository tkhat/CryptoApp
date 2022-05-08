package com.example.cryptoapp.presentation.portfolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cryptoapp.databinding.DashboardFragmentBinding
import com.example.cryptoapp.databinding.PortfolioFragmentBinding
import dagger.android.support.DaggerFragment

class PortfolioFragment : DaggerFragment() {


    private lateinit var binding: PortfolioFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PortfolioFragmentBinding.inflate(inflater,container,false)

        return  binding.root

    }

}
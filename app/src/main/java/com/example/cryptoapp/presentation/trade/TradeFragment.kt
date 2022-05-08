package com.example.cryptoapp.presentation.trade

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cryptoapp.databinding.PortfolioFragmentBinding
import com.example.cryptoapp.databinding.TradeFragmentBinding
import dagger.android.support.DaggerFragment

class TradeFragment: DaggerFragment() {


    private lateinit var binding: TradeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TradeFragmentBinding.inflate(inflater,container,false)

        return  binding.root

    }
}
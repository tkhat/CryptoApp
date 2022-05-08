package com.example.cryptoapp.presentation.prices

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cryptoapp.databinding.PortfolioFragmentBinding
import com.example.cryptoapp.databinding.PricesFragmentBinding
import dagger.android.support.DaggerFragment

class PricesFragment: DaggerFragment(){

    private lateinit var binding: PricesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PricesFragmentBinding.inflate(inflater,container,false)

        return  binding.root

    }


}
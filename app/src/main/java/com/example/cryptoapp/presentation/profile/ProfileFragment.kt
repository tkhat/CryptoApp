package com.example.cryptoapp.presentation.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cryptoapp.databinding.PortfolioFragmentBinding
import com.example.cryptoapp.databinding.ProfileFragmentBinding
import dagger.android.support.DaggerFragment

class ProfileFragment: DaggerFragment() {


    private lateinit var binding: ProfileFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ProfileFragmentBinding.inflate(inflater,container,false)

        return  binding.root

    }
}
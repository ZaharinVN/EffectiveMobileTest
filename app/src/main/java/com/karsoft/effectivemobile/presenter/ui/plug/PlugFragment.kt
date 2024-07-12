package com.karsoft.effectivemobile.presenter.ui.plug

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.karsoft.effectivemobile.R
import com.karsoft.effectivemobile.databinding.FragmentPlugBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PlugFragment : Fragment(R.layout.fragment_plug) {

    private val binding by lazy { FragmentPlugBinding.bind(requireView()) }
    private val btnBack by lazy { binding.btnBack }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack.setOnClickListener { findNavController().popBackStack() }
    }
}

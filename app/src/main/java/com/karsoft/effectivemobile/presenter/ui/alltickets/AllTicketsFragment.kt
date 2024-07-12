package com.karsoft.effectivemobile.presenter.ui.alltickets

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.karsoft.effectivemobile.R
import com.karsoft.effectivemobile.databinding.FragmentAllTicketsBinding
import com.karsoft.effectivemobile.utils.LocalStorage
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@AndroidEntryPoint
class AllTicketsFragment : Fragment(R.layout.fragment_all_tickets) {
    private var binding: FragmentAllTicketsBinding? = null
    private val viewModel: AllTicketsViewModel by viewModels()
    private val navArgs: AllTicketsFragmentArgs by navArgs()
    private val adapter = AllTicketsAdapter()

    @Inject
    lateinit var localStorage: LocalStorage

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAllTicketsBinding.bind(view)
        setupViews()
        setupListeners()
        observeTickets()
    }

    private fun setupViews() {
        binding?.let { b ->
            b.rvTickets.adapter = adapter
            b.tvCurrentDate.text = getCurrentDateText()
            b.tvTowns.text = "${localStorage.lastInputCity} - ${navArgs.arrivalTown}"
        }
    }

    private fun setupListeners() {
        binding?.ivBack?.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun observeTickets() {
        viewModel.getAllTicketsResult.onEach { result ->
            adapter.submitList(result)
        }.launchIn(viewLifecycleOwner.lifecycleScope)
    }

    private fun getCurrentDateText(): String {
        val formatter = SimpleDateFormat("dd MMMM", Locale("ru"))
        val date = Date()
        return "${formatter.format(date)}, 1 пассажир"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

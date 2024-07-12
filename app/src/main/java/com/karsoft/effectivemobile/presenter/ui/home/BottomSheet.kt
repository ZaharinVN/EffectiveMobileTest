package com.karsoft.effectivemobile.presenter.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.karsoft.effectivemobile.R
import com.karsoft.effectivemobile.databinding.BottomSheetSearchTicketBinding
import com.karsoft.effectivemobile.utils.LocalStorage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class BottomSheet : BottomSheetDialogFragment() {
    private var binding: BottomSheetSearchTicketBinding? = null

    @Inject
    lateinit var localStorage: LocalStorage
    private var onAnywhereItemClickListener: (nameOfCity: String) -> Unit = {}
    private var tipClickListener: () -> Unit = {}
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetSearchTicketBinding.inflate(layoutInflater)
        return binding?.root ?: throw IllegalStateException("Binding is null")
    }

    override fun onStart() {
        super.onStart()
        setupBottomSheetBehavior()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        setupListeners()
    }

    private fun setupBottomSheetBehavior() {
        binding?.let { b ->
            val view = dialog?.findViewById<FrameLayout>(R.id.design_bottom_sheet)
            view?.layoutParams?.height = ViewGroup.LayoutParams.MATCH_PARENT
            val behavior = BottomSheetBehavior.from(view!!)
            behavior.peekHeight = getWindowHeight()
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
            behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
                        dismiss()
                    }
                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {}
            })
        }
    }

    private fun setupViews() {
        binding?.let { b ->
            b.etFromWher.text = localStorage.lastInputCity
        }
    }

    private fun setupListeners() {
        binding?.let { b ->
            b.ivClear.setOnClickListener {
                b.etPlaceOfArrival.text.clear()
            }
            b.tip1.setOnClickListener {
                tipClickListener.invoke()
                dismiss()
            }
            b.tip3.setOnClickListener {
                tipClickListener.invoke()
                dismiss()
            }
            b.tip4.setOnClickListener {
                tipClickListener.invoke()
                dismiss()
            }
            b.tip2.setOnClickListener {
                onAnywhereItemClickListener.invoke(getString(R.string.anywhere))
                dismiss()
            }
            b.llSochi.setOnClickListener {
                onAnywhereItemClickListener.invoke(getString(R.string.sochi))
                dismiss()
            }
            b.llStambul.setOnClickListener {
                onAnywhereItemClickListener.invoke(getString(R.string.stambul))
                dismiss()
            }
            b.llPhuket.setOnClickListener {
                onAnywhereItemClickListener.invoke(getString(R.string.phuket))
                dismiss()
            }
        }
    }

    fun setOnAnywhereItemClickListener(listener: (nameOfCity: String) -> Unit) {
        onAnywhereItemClickListener = listener
    }

    fun setOnTipClickListener(listener: () -> Unit) {
        tipClickListener = listener
    }

    private fun getWindowHeight(): Int {
        return resources.displayMetrics.heightPixels
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

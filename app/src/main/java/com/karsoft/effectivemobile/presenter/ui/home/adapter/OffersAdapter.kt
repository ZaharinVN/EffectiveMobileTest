package com.karsoft.effectivemobile.presenter.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.karsoft.effectivemobile.R
import com.karsoft.effectivemobile.databinding.ItemOfferBinding
import com.karsoft.effectivemobile.presenter.models.OfferUI

class OffersAdapter : ListAdapter<OfferUI, OffersAdapter.OfferViewHolder>(OfferDiffCallback()) {

    inner class OfferViewHolder(private val binding: ItemOfferBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(offerUI: OfferUI) {
            with(binding) {
                tvTitle.text = offerUI.title
                tvTown.text = offerUI.town
                tvPrice.text = "от ${offerUI.price.value} ₽"
                shapeableIvOffer.setImageDrawable(
                    binding.root.context.getDrawable(
                        getOfferImageResource(offerUI.id)
                    )
                )
            }
        }

        private fun getOfferImageResource(id: Int): Int {
            return when (id) {
                1 -> R.drawable.pic_offer_1
                2 -> R.drawable.pic_offer_2
                3 -> R.drawable.pic_offer_3
                else -> throw IllegalArgumentException("Invalid offer ID: $id")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val binding = ItemOfferBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OfferViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class OfferDiffCallback : DiffUtil.ItemCallback<OfferUI>() {
        override fun areItemsTheSame(oldItem: OfferUI, newItem: OfferUI): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: OfferUI, newItem: OfferUI): Boolean {
            return oldItem == newItem
        }
    }
}

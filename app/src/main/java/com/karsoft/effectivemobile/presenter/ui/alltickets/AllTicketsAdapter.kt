package com.karsoft.effectivemobile.presenter.ui.alltickets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.karsoft.effectivemobile.databinding.ItemTicketBinding
import com.karsoft.effectivemobile.presenter.models.TicketUI

class AllTicketsAdapter : ListAdapter<TicketUI, AllTicketsAdapter.TicketViewHolder>(MyDiffUtil()) {

    inner class TicketViewHolder(private val binding: ItemTicketBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: TicketUI) {
            binding.tvBadge.visibility = if (item.badge != null) View.VISIBLE else View.GONE
            binding.tvBadge.text = item.badge
            binding.tvPrice.text = "${item.price.value} ₽"
            binding.tvTime.text = "${item.departure.date} - ${item.arrival.date}"
            binding.tvCodeAirport.text = item.departure.airport
            binding.tvTimePilot.text = item.arrival.airport
            binding.tvTimeOfFly.text = if (item.has_transfer) {
                "3.5ч в пути / Без пересадок"
            } else {
                "3.5ч в пути / 1 пересадка"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketViewHolder {
        return TicketViewHolder(
            ItemTicketBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TicketViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class MyDiffUtil : DiffUtil.ItemCallback<TicketUI>() {

        override fun areItemsTheSame(oldItem: TicketUI, newItem: TicketUI): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TicketUI, newItem: TicketUI): Boolean {
            return oldItem == newItem
        }
    }
}
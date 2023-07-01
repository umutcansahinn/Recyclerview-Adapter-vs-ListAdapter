package com.umutcansahin.recycleradaptervslistadapter.ui.dashboard

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber
import com.umutcansahin.recycleradaptervslistadapter.databinding.AdapterItemBinding

class DashboardViewHolder(private val binding: AdapterItemBinding) : ViewHolder(binding.root) {

    fun bind(data: DataNumber) {
        binding.textViewId.text = data.number.toString()
    }
}
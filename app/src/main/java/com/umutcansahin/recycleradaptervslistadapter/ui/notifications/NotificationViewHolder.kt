package com.umutcansahin.recycleradaptervslistadapter.ui.notifications

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber
import com.umutcansahin.recycleradaptervslistadapter.databinding.AdapterItemBinding


class NotificationViewHolder(private val binding: AdapterItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: DataNumber) {
        binding.textViewId.text = data.number.toString()
        binding.constraintLayout.setBackgroundColor(Color.CYAN)
    }
}
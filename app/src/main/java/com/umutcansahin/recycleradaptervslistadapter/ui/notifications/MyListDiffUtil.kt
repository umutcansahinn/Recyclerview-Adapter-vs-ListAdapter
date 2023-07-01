package com.umutcansahin.recycleradaptervslistadapter.ui.notifications

import androidx.recyclerview.widget.DiffUtil
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber

class MyListDiffUtil : DiffUtil.ItemCallback<DataNumber>() {
    override fun areItemsTheSame(oldItem: DataNumber, newItem: DataNumber): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: DataNumber, newItem: DataNumber): Boolean {
        return oldItem == newItem
    }
}
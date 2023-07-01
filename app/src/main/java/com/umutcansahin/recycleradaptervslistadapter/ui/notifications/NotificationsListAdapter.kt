package com.umutcansahin.recycleradaptervslistadapter.ui.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber
import com.umutcansahin.recycleradaptervslistadapter.databinding.AdapterItemBinding


class NotificationsListAdapter : ListAdapter<DataNumber, NotificationViewHolder>(MyListDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        return NotificationViewHolder(
            AdapterItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
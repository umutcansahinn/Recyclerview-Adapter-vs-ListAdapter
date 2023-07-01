package com.umutcansahin.recycleradaptervslistadapter.ui.dashboard

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber
import com.umutcansahin.recycleradaptervslistadapter.databinding.AdapterItemBinding

class DashboardRecyclerAdapter : RecyclerView.Adapter<DashboardViewHolder>() {

    private val list = ArrayList<DataNumber>()

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(newList: List<DataNumber>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        return DashboardViewHolder(
            AdapterItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val number = list[position]
        holder.bind(number)
    }
}
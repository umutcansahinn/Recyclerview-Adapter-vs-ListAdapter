package com.umutcansahin.recycleradaptervslistadapter.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber
import com.umutcansahin.recycleradaptervslistadapter.databinding.AdapterItemBinding


class HomeRecyclerAdapter : RecyclerView.Adapter<HomeViewHolder>() {

    private var list: ArrayList<DataNumber> = ArrayList()

    fun updateList(newList: List<DataNumber>) {
        val diffResult = DiffUtil.calculateDiff(MyDiffUtil(list, newList))
        list.clear()
        list.addAll(newList)
        diffResult.dispatchUpdatesTo(this)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
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

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val number = list[position]
        holder.bind(number)
    }
}
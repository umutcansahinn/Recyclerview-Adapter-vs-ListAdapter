package com.umutcansahin.recycleradaptervslistadapter.ui.home

import androidx.recyclerview.widget.DiffUtil
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber

class MyDiffUtil(
    private val oldList: List<DataNumber>,
    private val newList: List<DataNumber>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.number == newItem.number
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem == newItem
    }
}
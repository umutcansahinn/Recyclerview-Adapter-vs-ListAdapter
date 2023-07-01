package com.umutcansahin.recycleradaptervslistadapter.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.umutcansahin.recycleradaptervslistadapter.data.DataNumber

class SharedViewModel : ViewModel() {

    private val _state = MutableLiveData<List<DataNumber>>()
    val state: LiveData<List<DataNumber>> = _state

    private val list = ArrayList<DataNumber>()
    private var number = 0

    fun getList() {
        for (id in 1..200) {
            number += 2
            list.add(DataNumber(id = id, number = number))
        }
        _state.value = list
    }

    fun addNewItem() {
        for (id in 201..300) {
            number += 1_000
            list.add(DataNumber(id = id, number = number))
        }
        _state.value = list
    }
}
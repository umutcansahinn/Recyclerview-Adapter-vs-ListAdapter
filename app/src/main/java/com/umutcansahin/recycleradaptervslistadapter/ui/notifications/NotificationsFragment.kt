package com.umutcansahin.recycleradaptervslistadapter.ui.notifications

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.umutcansahin.recycleradaptervslistadapter.databinding.FragmentNotificationsBinding
import com.umutcansahin.recycleradaptervslistadapter.ui.viewModel.SharedViewModel

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<SharedViewModel>()

    private val adapter by lazy {
        NotificationsListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = adapter
        viewModel.state.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
            adapter.notifyDataSetChanged()
        }
        binding.buttonAdd.setOnClickListener {
            viewModel.addNewItem()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
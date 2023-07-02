package com.umutcansahin.recycleradaptervslistadapter.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.umutcansahin.recycleradaptervslistadapter.databinding.FragmentDashboardBinding
import com.umutcansahin.recycleradaptervslistadapter.ui.viewModel.SharedViewModel

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<SharedViewModel>()

    private val adapter by lazy {
        DashboardRecyclerAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = adapter
        viewModel.state.observe(viewLifecycleOwner) { list ->
            adapter.updateList(list)
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
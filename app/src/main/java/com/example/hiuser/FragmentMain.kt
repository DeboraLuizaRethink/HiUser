package com.example.hiuser

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hiuser.databinding.FragmentoMainBinding

class FragmentMain: Fragment(R.layout.fragmento_main) {
    private var fragmentFirstBinding: FragmentoMainBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentoMainBinding.bind(view)
        fragmentFirstBinding = binding

        binding.btnCadastrar.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_fragmentInfo)
        }
    }
}
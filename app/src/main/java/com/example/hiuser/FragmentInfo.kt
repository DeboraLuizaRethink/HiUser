package com.example.hiuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hiuser.databinding.FragmentInfoBinding
import com.example.hiuser.databinding.FragmentoMainBinding

class FragmentInfo:Fragment(R.layout.fragment_info) {
    private var fragmentFirstBinding: FragmentInfoBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentInfoBinding.bind(view)
        fragmentFirstBinding = binding


        binding.btnSeguir.setOnClickListener {
            val parametros = bundleOf(
                "name_text" to binding.edtTextName.text.toString(),
                "country_text" to binding.edtTextCountry.text.toString(),
                "state_text" to binding.edtTextState.text.toString(),
                "city_text" to binding.edtTextCity.text.toString()
            )
            findNavController().navigate(R.id.action_fragmentInfo_to_fragmentAnswers, parametros)
        }
    }
}
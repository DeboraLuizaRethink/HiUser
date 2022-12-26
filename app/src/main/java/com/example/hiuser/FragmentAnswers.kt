package com.example.hiuser

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hiuser.databinding.FragmentInfoBinding
import com.example.hiuser.databinding.FragmentoAnswersBinding
import java.util.*

class FragmentAnswers: Fragment(R.layout.fragmento_answers) {
    companion object {
        private const val var_name_text = "name_text"
        private const val var_country_text = "country_text"
        private const val var_state_text = "state_text"
        private const val var_city_text = "city_text"

    }
    private var fragmentFirstBinding: FragmentoAnswersBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentoAnswersBinding.bind(view)
        fragmentFirstBinding = binding

        fun capitalize(word: String): CharSequence? {
            return word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }

        val nameText: String = requireArguments().getString(var_name_text)!!
        val countryText: String = requireArguments().getString(var_country_text)!!
        val stateText: String = requireArguments().getString(var_state_text)!!
        val cityText: String = requireArguments().getString(var_city_text)!!

        binding.txtUser.text= capitalize(nameText)
        binding.txtCountry.text= capitalize(countryText)
        binding.txtState.text= capitalize(stateText)
        binding.txtCity.text= capitalize(cityText)

        binding.btnVoltar.setOnClickListener {
            val parametros = bundleOf(
                "name_user" to nameText
            )
            findNavController().navigate(R.id.action_fragmentAnswers_to_fragmentMain, parametros)
        }

        fun main() {
           val user = WelcomeCostumer(nameText, countryText)
            println("nome passado: ${user.name} país da pessoa: ${user.country}")
            /*Toast.makeText(this, "Seja bem vinda: ${user.customerName} do(a) ${user.country}" ,
                Toast.LENGTH_SHORT).show()*/
        }
        main()
    }
}
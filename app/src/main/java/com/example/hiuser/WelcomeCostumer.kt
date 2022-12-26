package com.example.hiuser

import android.widget.Toast
import java.util.*

 data class WelcomeCostumer(val name: String) {
    val customerName = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var country: String = ""

        constructor(n: String, country: String): this(n){
            this.country = country
        }

}
package com.example.hiuser

import android.widget.Toast
import java.util.*

class WelcomeCostumer(val name: String) {
    val customerKey = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var country: String = ""

        constructor(n: String, country: String): this(n){
            this.country = country
            /*Toast.makeText(this, "Seja bem vinda: $customerKey do(a) $country" ,
                Toast.LENGTH_SHORT).show()*/
        }

}
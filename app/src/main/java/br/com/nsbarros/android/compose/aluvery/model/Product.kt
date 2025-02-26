package br.com.nsbarros.android.compose.aluvery.model

import java.math.BigDecimal

data class Product(
    val name: String,
    var price: BigDecimal = BigDecimal("0.0"),
    var image: String = "",
    val description: String? = null
)

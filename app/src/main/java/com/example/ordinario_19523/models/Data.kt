package com.example.ordinario_19523.models

import androidx.annotation.DrawableRes

data class Data(
    val num : Int,
    val titulo: String,
    @DrawableRes val imagen: Int,
)
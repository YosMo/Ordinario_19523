package com.example.ordinario_19523.viewmodels

import com.example.ordinario_19523.R
import com.example.ordinario_19523.models.Data


class CardsModels {
    init {}

    fun getCardList(): ArrayList<Data> {
        var dataList: ArrayList<Data> = ArrayList<Data>()

        dataList.add(Data(1,"Adivina la edad", R.drawable.pastel))
        dataList.add(Data(2,"Gatos", R.drawable.gato))
        dataList.add(Data(3,"NBA", R.drawable.nba))
        dataList.add(Data(4,"Chuck Norris", R.drawable.chuck))
        //Create list


        return dataList
    }
}
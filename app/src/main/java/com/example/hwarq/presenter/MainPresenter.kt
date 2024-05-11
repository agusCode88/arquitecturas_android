package com.example.hwarq.presenter

import com.example.hwarq.contract.MainContract
import com.example.hwarq.model.Lenguage

class MainPresenter(
    private val view:MainContract.View,
    private val model: MainContract.Model
) : MainContract.Presenter
{
    private var listLenguages = mutableListOf<Lenguage>()
    override fun getLenguages() {
        listLenguages = model.downloadLenguages()
        view.showLenguage(random(listLenguages))

    }
    fun random(lenguages: MutableList<Lenguage>): Lenguage {
        val position = (0..10).random()
        return lenguages[position]
    }

}
package com.example.hwarq.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hwarq.model.Lenguage
import com.example.hwarq.model.LenguageFactory

class MainViewModel: ViewModel() {

    val lenguageLV = MutableLiveData<Lenguage>()

    fun showRandomLenguage(){
        val lenguageRandom = LenguageFactory.random()
        lenguageLV.postValue(lenguageRandom)
    }

}
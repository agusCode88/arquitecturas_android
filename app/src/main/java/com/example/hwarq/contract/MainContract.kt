package com.example.hwarq.contract

import com.example.hwarq.model.Lenguage

interface MainContract {

    interface View{
        fun showLenguage(lenguage: Lenguage)
        fun showError(message: String)

    }

    interface Presenter{
         fun getLenguages()
    }

    interface Model{
        fun downloadLenguages(): MutableList<Lenguage>
    }

}
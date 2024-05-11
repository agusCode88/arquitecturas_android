package com.example.hwarq.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hwarq.R
import com.example.hwarq.contract.MainContract
import com.example.hwarq.databinding.ActivityMainBinding
import com.example.hwarq.model.Lenguage
import com.example.hwarq.model.MainModel
import com.example.hwarq.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        presenter = MainPresenter(this, MainModel())

        mainBinding.viewContainer.setOnClickListener { presenter.getLenguages() }


    }

    override fun showLenguage(lenguage: Lenguage) {

        mainBinding.descripcionLenguaje.text = lenguage.descripcion
        mainBinding.nombreLenguaje.text = lenguage.nombre

    }

    override fun showError(message: String) {

    }
}
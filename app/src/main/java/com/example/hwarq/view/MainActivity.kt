package com.example.hwarq.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.hwarq.databinding.ActivityMainBinding
import com.example.hwarq.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private val lenguageMainViewModel: MainViewModel by viewModels()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        lenguageMainViewModel.lenguageLV.observe(this , Observer {

            mainBinding.descripcionLenguaje.text = it.descripcion
            mainBinding.nombreLenguaje.text = it.nombre

        })

        mainBinding.viewContainer.setOnClickListener { lenguageMainViewModel.showRandomLenguage() }

    }
}
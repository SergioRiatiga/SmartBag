package com.misiontic2022.smartbag.views.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.misiontic2022.smartbag.R
import com.misiontic2022.smartbag.databinding.ActivityMainBinding

class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var Home: Button
    lateinit var Registrarse: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_login)
        Home= findViewById(R.id.ingresar)
        Registrarse= findViewById(R.id.registrarse)
        Home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
        Registrarse.setOnClickListener {
            startActivity(Intent(this,RegistrarseActivity::class.java))
        }
    }
}
package com.misiontic2022.smartbag.views.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.misiontic2022.smartbag.R

class RegistrarseActivity: AppCompatActivity() {
    lateinit var home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        home=findViewById(R.id.registro)
        home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}
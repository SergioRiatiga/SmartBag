package com.misiontic2022.smartbag.views.ui.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.misiontic2022.smartbag.R

class HomeActivity:AppCompatActivity() {
    lateinit var menu: Menu
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater= menuInflater
        inflater.inflate(R.menu.bnv_menu, menu)
        return true
    }

}
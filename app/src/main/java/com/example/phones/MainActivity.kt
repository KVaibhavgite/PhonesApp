package com.example.phones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.collection.arraySetOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewTreeLifecycleOwner.set
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController

import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.setupActionBarWithNavController as setupActionBarWithNavController1

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainerView)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.dial_Menu,
                R.id.contacts_Menu,
                R.id.favorites_Menu
            )
        ).apply {
            setupActionBarWithNavController1(navController, this)
        }
        bottomNavigationView.setupWithNavController(navController)/*
        loadFragment(Dial_Menu())
        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.dial -> {
                    loadFragment(Dial_Menu())
                    true
                }
                R.id.contact -> {
                    loadFragment(Contacts_Menu())
                    true
                }
                R.id.favorites -> {
                    loadFragment(Favorites_Menu())
                    true
                }
                else -> false

            }
        }




    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView,fragment)
        transaction.commit()*/
    }



}


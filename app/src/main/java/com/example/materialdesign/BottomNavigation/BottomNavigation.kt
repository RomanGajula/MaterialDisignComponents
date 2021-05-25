package com.example.materialdesign.BottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottomNavigationBinding
import com.example.materialdesign.tab.fragment.Fragment_tab_1
import com.example.materialdesign.tab.fragment.Fragment_tab_2
import com.example.materialdesign.tab.fragment.Fragment_tab_3
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation : AppCompatActivity() {

    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBottomNavigationBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_bottom_navigation
            )

        setupToolBar()
        updateFragment(Fragment_tab_2())
        setupBottomNavigationView(binding.bottomNav)
    }

    private fun setupToolBar() {
        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
    }

    private fun updateFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameNav, fragment).commit()
    }

    private fun  setupBottomNavigationView(bottomNav: BottomNavigationView) {
        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.user -> {
                    updateFragment(Fragment_tab_3())
                }
                R.id.cloudDone -> {
                    updateFragment(Fragment_tab_2())
                }
                R.id.info -> {
                    updateFragment(Fragment_tab_1())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
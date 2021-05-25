package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.materialdesign.databinding.ActivityBottomNavigationBinding
import com.example.materialdesign.databinding.ActivityNavigationBinding
import com.example.materialdesign.tab.Fragment_tab_1
import com.example.materialdesign.tab.Fragment_tab_2
import com.example.materialdesign.tab.Fragment_tab_3

class BottomNavigation : AppCompatActivity() {

    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBottomNavigationBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_bottom_navigation
            )

        toolBar = findViewById(R.id.toolbar)

        setSupportActionBar(toolBar)

        updateFragment(Fragment_tab_2())

        binding.bottomNav.setOnNavigationItemSelectedListener {
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

    private fun updateFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameNav, fragment).commit()
    }
}
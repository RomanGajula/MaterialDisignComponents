package com.example.materialdesign.navigation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityNavigationBinding
import com.google.android.material.navigation.NavigationView

class Navigation : AppCompatActivity() {

    lateinit var toolBar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityNavigationBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_navigation
            )

        drawerLayout = findViewById(R.id.drawerLayout)

        toggle =
            ActionBarDrawerToggle(this, drawerLayout,
                R.string.openDrawer,
                R.string.closeDrawer
            )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        toolBar = findViewById(R.id.toolbar)

        setSupportActionBar(toolBar)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        clickNavigationItem(binding.navView, binding.drawerLayout)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun clickNavigationItem(nav: NavigationView, drawerLayout: DrawerLayout) {
        nav.setNavigationItemSelectedListener {
            it.isChecked = true
            drawerLayout.closeDrawers()
            return@setNavigationItemSelectedListener true
        }
    }
}
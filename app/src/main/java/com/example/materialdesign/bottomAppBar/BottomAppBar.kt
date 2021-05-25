package com.example.materialdesign.bottomAppBar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottomAppBarBinding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.navigation.NavigationView

class BottomAppBar : AppCompatActivity() {

    lateinit var toolBar: Toolbar
    private lateinit var toggle: ActionBarDrawerToggle

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBottomAppBarBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_bottom_app_bar
            )

        setupBottomAppBar(binding.bottomAppBar, binding.draverBottomAppBar)
        setupNavMenu(binding.draverBottomAppBar)
        setupToolBar()
        clickNavigationItem(binding.navBottomAppBar, binding.draverBottomAppBar)
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

    private fun setupToolBar() {
        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
    }

    private fun setupNavMenu(drawerLayout: DrawerLayout) {
        toggle = ActionBarDrawerToggle(
            this, drawerLayout,
            R.string.openDrawer,
            R.string.closeDrawer
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    @SuppressLint("WrongConstant")
    fun setupBottomAppBar(bottomAppBar: BottomAppBar, drawerLayout: DrawerLayout) {
        bottomAppBar.setNavigationOnClickListener {
            drawerLayout.openDrawer(Gravity.START)
        }
        bottomAppBar.replaceMenu(R.menu.menu_bottom_nav)
    }
}
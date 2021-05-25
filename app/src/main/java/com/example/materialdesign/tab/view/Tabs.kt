package com.example.materialdesign.tab.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityTabsBinding
import com.example.materialdesign.tab.adapter.TabAdapter
import com.google.android.material.tabs.TabLayout

class Tabs : AppCompatActivity() {

    lateinit var toolBar: Toolbar
    private val tabAdapter =
        TabAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTabsBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_tabs
            )

        setupToolBar()
        setupViewPager(binding.viewPager, binding.tabLayout)

    }

    private fun setupViewPager(viewPager: ViewPager, tab: TabLayout) {
        viewPager.adapter = tabAdapter
        tab.setupWithViewPager(viewPager)
    }

    private fun setupToolBar() {
        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
    }

}
package com.example.materialdesign.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityMainBinding
import com.example.materialdesign.databinding.ActivityTabsBinding

class Tabs : AppCompatActivity() {

    lateinit var toolBar: Toolbar
    private val tabAdapter = TabAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTabsBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_tabs
            )

        toolBar = findViewById(R.id.toolbar)

        setSupportActionBar(toolBar)
        setupViewPager(binding.viewPager)
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

    fun setupViewPager(viewPager: ViewPager) {
        viewPager.adapter = tabAdapter
    }

}
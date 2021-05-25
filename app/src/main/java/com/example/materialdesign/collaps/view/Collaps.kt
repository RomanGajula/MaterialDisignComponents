package com.example.materialdesign.collaps.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.materialdesign.R
import com.example.materialdesign.collaps.adapter.CollapsAdapter

class Collaps : AppCompatActivity() {

    //НЕ УДАЛОСЬ РЕАЛИЗОВАТЬ COLLAPS, ПОТОМУ ЧТО НЕ ПОЛУЧИЛОСЬ ПОДКЛЮЧИТЬ ЗАВИСИМОСТИ В GRADLE (implementation 'androidx.palette:palette-ktx:1.0.0')

    var collapsAdapter = CollapsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: com.example.materialdesign.databinding.ActivityCollapsBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_collaps
            )

//        binding.apply {
//            recyclerView.setHasFixedSize(true)
//            recyclerView.layoutManager = LinearLayoutManager(this@Collaps)
//            recyclerView.adapter = collapsAdapter
//        }

        setSupportActionBar(binding.collapsToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
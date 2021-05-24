package com.example.materialdesign.bottomSheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottomSheetBinding

class BottomSheet : AppCompatActivity() {

    private val bottomSheetFragment =
        BottomSheetFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBottomSheetBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_bottom_sheet
            )
    }

    fun clickButtonAdd(view: View) {
        bottomSheetFragment.show(supportFragmentManager, "BottomSheetDialog")
    }
}
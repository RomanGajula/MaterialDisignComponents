package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.materialdesign.databinding.ActivityBottomSheetBinding
import com.example.materialdesign.databinding.ActivityNavigationBinding

class BottomSheet : AppCompatActivity() {

    private val bottomSheetFragment = BottomSheetFragment()

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
package com.example.materialdesign.bottomSheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.materialdesign.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment :  BottomSheetDialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_modal, container, false)
    }
}
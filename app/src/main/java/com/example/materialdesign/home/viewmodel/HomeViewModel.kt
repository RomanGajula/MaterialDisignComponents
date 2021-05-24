package com.example.materialdesign.home.viewmodel

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.materialdesign.Navigation
import com.example.materialdesign.home.model.HomeModel
import com.example.materialdesign.home.repository.HomeRepository
import com.example.materialdesign.tab.Tabs

class HomeViewModel: ViewModel() {

    private lateinit var intent: Intent

    fun getMaterialDesignComponent() : List<HomeModel> {
        return HomeRepository.materialDesignComponent
    }

    fun checkClickMaterialDesignComponent(text: String, view: View) {
        if (text == "TabLayout") {
            intent = Intent(view.context, Tabs::class.java)
        } else if (text == "NavigationView") {
            intent = Intent(view.context, Navigation::class.java)
        }

        view.context.startActivity(intent)
    }

}
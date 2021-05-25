package com.example.materialdesign.home.viewmodel

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.materialdesign.bottomAppBar.BottomAppBar
import com.example.materialdesign.BottomNavigation.BottomNavigation
import com.example.materialdesign.bottomSheet.BottomSheet
import com.example.materialdesign.collaps.view.Collaps
import com.example.materialdesign.navigation.Navigation
import com.example.materialdesign.home.model.HomeModel
import com.example.materialdesign.home.repository.HomeRepository
import com.example.materialdesign.tab.view.Tabs

class HomeViewModel : ViewModel() {

    private lateinit var intent: Intent

    fun getMaterialDesignComponent(): List<HomeModel> {
        return HomeRepository.materialDesignComponent
    }

    fun checkClickMaterialDesignComponent(text: String, view: View) {
        when (text) {
            "TabLayout" ->
                intent = Intent(view.context, Tabs::class.java)

            "NavigationView" ->
                intent = Intent(view.context, Navigation::class.java)

            "Collapsing Toolbar" ->
                intent = Intent(view.context, Collaps::class.java)

            "Bottom Sheet" ->
                intent = Intent(view.context, BottomSheet::class.java)

            "Bottom Navigation" ->
                intent = Intent(view.context, BottomNavigation::class.java)

            "BottomAppBar" ->
                intent = Intent(view.context, BottomAppBar::class.java)
        }

        view.context.startActivity(intent)
    }

}
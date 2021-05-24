package com.example.materialdesign.home.repository

import com.example.materialdesign.home.model.HomeModel

class HomeRepository {

    companion object {
        var materialDesignComponent = arrayListOf<HomeModel>(
            HomeModel("TabLayout"),
            HomeModel("NavigationView"),
            HomeModel("SnackBar"),
            HomeModel("TabLayout"),
            HomeModel("TextInputLayout"),
            HomeModel("Collapsing Toolbar"),
            HomeModel("Collapsing Toolbar + FAB"),
            HomeModel("Bottom Sheet"),
            HomeModel("Bottom Navigation 3"),
            HomeModel("Bottom Navigation 5"),
            HomeModel("BottomAppBar")
        )
    }
}
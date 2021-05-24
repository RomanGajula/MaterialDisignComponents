package com.example.materialdesign.home.repository

import com.example.materialdesign.home.model.HomeModel

class HomeRepository {

    companion object {
        var materialDesignComponent = arrayListOf<HomeModel>(
            HomeModel("TabLayout"),
            HomeModel("NavigationView"),
            HomeModel("Collapsing Toolbar"),
            HomeModel("Bottom Sheet"),
            HomeModel("Bottom Navigation"),
            HomeModel("BottomAppBar")
        )
    }
}
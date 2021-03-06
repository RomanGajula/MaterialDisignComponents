package com.example.materialdesign.tab.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.materialdesign.tab.fragment.Fragment_tab_1
import com.example.materialdesign.tab.fragment.Fragment_tab_2
import com.example.materialdesign.tab.fragment.Fragment_tab_3

class TabAdapter(var fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    var tabs = arrayListOf<Fragment>(
        Fragment_tab_1(),
        Fragment_tab_2(),
        Fragment_tab_3()
    )
    var tabsTitle = arrayListOf<String>(
        "House",
        "Cloud",
        "User"
    )

    override fun getItem(position: Int): Fragment {
        return tabs[position]
    }

    override fun getCount(): Int {
        return tabs.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabsTitle[position]
    }

}
package com.example.projectworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.projectworkshop.fragments.AddFragment
import com.example.projectworkshop.fragments.HomeFragment
import com.example.projectworkshop.fragments.SettingsFragment
import com.example.projectworkshop.fragments.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }
    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(AddFragment(),"Add")
        adapter.addFragment(SettingsFragment(),"Settings")

        val viewpage = findViewById<ViewPager>(R.id.viewPager)
        viewpage.adapter = adapter

        val tabs = findViewById<TabLayout>(R.id.tabs)
        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_add_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_account_circle_24)

    }
}
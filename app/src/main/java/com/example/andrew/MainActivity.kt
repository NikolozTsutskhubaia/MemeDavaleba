package com.example.andrew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.andrew.adapter.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var TabLayout: TabLayout
    private lateinit var ViewPager2: ViewPager2
    private lateinit var ViewPagerFragmentAdapter: ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        ViewPager2.adapter = ViewPagerFragmentAdapter
        TabLayoutMediator(TabLayout, ViewPager2) {tab, position ->
            tab.text = "${position}"
            when(position){
                0 -> tab.text = "Notes"
                1 -> tab.text = "Shesavali"
                2 -> tab.text = "Gadaoba"
            }
        }.attach()
    }

    private fun init() {
        TabLayout = findViewById(R.id.TabLayout)
        ViewPager2 = findViewById(R.id.ViewPager2)
        ViewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
    }
}
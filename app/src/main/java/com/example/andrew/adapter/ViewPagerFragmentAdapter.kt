package com.example.andrew.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.andrew.fragments.FragmentFirst
import com.example.andrew.fragments.FragmentSecond
import com.example.andrew.fragments.FragmentThird

class ViewPagerFragmentAdapter(Activity: FragmentActivity): FragmentStateAdapter(Activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FragmentFirst()
            1 -> FragmentSecond()
            2 -> FragmentThird()
            else -> FragmentFirst()
        }

    }

}
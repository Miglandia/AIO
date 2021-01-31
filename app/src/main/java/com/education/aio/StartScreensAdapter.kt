package com.education.aio

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class StartScreensAdapter(fm: FragmentManager?) :
    FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return MathScreen()
    }

    override fun getCount(): Int {
        // показываем наши табы (последний case + 1)
        return 5
    }
}
package com.education.aio.main.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.util.Log
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.education.aio.R
import com.education.aio.StartScreensAdapter
import com.education.aio.main.ui.fragments.RegistrationFragment
import kotlinx.android.synthetic.main.activity_start_screens.*

class StartScreens : AppCompatActivity() {
    var tabs: TabLayout? = null
    var join: Button? = null

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screens)
        val sectionsPagerAdapter = StartScreensAdapter(supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        login_as_guest.text = Html.fromHtml("<font color=\"#99000000\">Войти как</font> <font color=\"#2787F5\"><u>гость</u></font>")
        tabs = findViewById(R.id.tabs)
        join = findViewById(R.id.join)

        join!!.setOnClickListener {
            Log.d("selected_join", "" + "clicked")
            val intent = Intent(this, RegistrationFragment::class.java)
            startActivity(intent)
        }
        login_as_guest.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tabs!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            @SuppressLint("ResourceType")
            override fun onTabSelected(p0: TabLayout.Tab?) {
                viewPager.currentItem = tabs!!.selectedTabPosition
                Log.d("selected_item", "" + tabs!!.selectedTabPosition)
                setCustomBackground()


            }


        })

        tabs!!.setupWithViewPager(viewPager)


    }

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceType")
    private fun setCustomBackground() {

        val position = tabs!!.selectedTabPosition
        if (position == 0) {
            join!!.setBackgroundColor(resources.getColor(R.color.blue))

            login_as_guest.text = Html.fromHtml("<font color=\"#99000000\">Войти как</font> <font color=\"#2787F5\"><u>гость</u></font>")
            tabs!!.getTabAt(0)!!.icon = resources.getDrawable(R.drawable.active_blue_circle)
            tabs!!.getTabAt(1)!!.icon = resources.getDrawable(R.drawable.inactive_circle_blue)
            tabs!!.getTabAt(2)!!.icon = resources.getDrawable(R.drawable.inactive_circle_blue)
            tabs!!.getTabAt(3)!!.icon = resources.getDrawable(R.drawable.inactive_circle_blue)
            tabs!!.getTabAt(4)!!.icon = resources.getDrawable(R.drawable.inactive_circle_blue)
            image_subjects_start_screen.background = getDrawable(R.drawable.ic_math)
            image_subjects_start_screen.visibility = View.VISIBLE
            additional_subjects.visibility = View.GONE
            title_subjects_start_screen.text = "Математика"
            title_subjects_start_screen.setTextColor(resources.getColor(R.color.blue))
        } else if (position == 1) {
            login_as_guest.text = Html.fromHtml("<font color=\"#99000000\">Войти как</font> <font color=\"#FFA800\"><u>гость</u></font>")
            join!!.setBackgroundColor(resources.getColor(R.color.yellow))
            tabs!!.getTabAt(0)!!.icon = resources.getDrawable(R.drawable.inactive_circle_orange)
            tabs!!.getTabAt(1)!!.icon = resources.getDrawable(R.drawable.active_orange_circle)
            tabs!!.getTabAt(2)!!.icon = resources.getDrawable(R.drawable.inactive_circle_orange)
            tabs!!.getTabAt(3)!!.icon = resources.getDrawable(R.drawable.inactive_circle_orange)
            tabs!!.getTabAt(4)!!.icon = resources.getDrawable(R.drawable.inactive_circle_orange)
            image_subjects_start_screen.background = getDrawable(R.drawable.ic_russian_doll)
            image_subjects_start_screen.visibility = View.VISIBLE
            additional_subjects.visibility = View.GONE
            title_subjects_start_screen.text = "Русский"
            title_subjects_start_screen.setTextColor(resources.getColor(R.color.yellow))
        } else if (position == 2) {
            login_as_guest.text = Html.fromHtml("<font color=\"#99000000\">Войти как</font> <font color=\"#008000\"><u>гость</u></font>")
            join!!.setBackgroundColor(resources.getColor(R.color.green))
            tabs!!.getTabAt(0)!!.icon = resources.getDrawable(R.drawable.inactive_circle_green)
            tabs!!.getTabAt(1)!!.icon = resources.getDrawable(R.drawable.inactive_circle_green)
            tabs!!.getTabAt(2)!!.icon = resources.getDrawable(R.drawable.active_green_circle)
            tabs!!.getTabAt(3)!!.icon = resources.getDrawable(R.drawable.inactive_circle_green)
            tabs!!.getTabAt(4)!!.icon = resources.getDrawable(R.drawable.inactive_circle_green)
            image_subjects_start_screen.background = getDrawable(R.drawable.ic_bio)
            image_subjects_start_screen.visibility = View.VISIBLE
            additional_subjects.visibility = View.GONE
            title_subjects_start_screen.text = "Биология"
            title_subjects_start_screen.setTextColor(resources.getColor(R.color.green))
        } else if (position == 3) {
            login_as_guest.text = Html.fromHtml("<font color=\"#99000000\">Войти как</font> <font color=\"#461656\"><u>гость</u></font>")
            join!!.setBackgroundColor(resources.getColor(R.color.violet))
            tabs!!.getTabAt(0)!!.icon = resources.getDrawable(R.drawable.inactive_circle_violet)
            tabs!!.getTabAt(1)!!.icon = resources.getDrawable(R.drawable.inactive_circle_violet)
            tabs!!.getTabAt(2)!!.icon = resources.getDrawable(R.drawable.inactive_circle_violet)
            tabs!!.getTabAt(3)!!.icon = resources.getDrawable(R.drawable.active_violet_circle)
            tabs!!.getTabAt(4)!!.icon = resources.getDrawable(R.drawable.inactive_circle_violet)
            image_subjects_start_screen.background = getDrawable(R.drawable.ic_chemistry)
            image_subjects_start_screen.visibility = View.VISIBLE
            additional_subjects.visibility = View.GONE
            title_subjects_start_screen.text = "Химия"
            title_subjects_start_screen.setTextColor(resources.getColor(R.color.violet))
        } else if (position == 4) {
            login_as_guest.text = Html.fromHtml("<font color=\"#99000000\">Войти как</font> <font color=\"#DD5044\"><u>гость</u></font>")
            join!!.setBackgroundColor(resources.getColor(R.color.red))
            tabs!!.getTabAt(0)!!.icon = resources.getDrawable(R.drawable.inactive_circle_red)
            tabs!!.getTabAt(1)!!.icon = resources.getDrawable(R.drawable.inactive_circle_red)
            tabs!!.getTabAt(2)!!.icon = resources.getDrawable(R.drawable.inactive_circle_red)
            tabs!!.getTabAt(3)!!.icon = resources.getDrawable(R.drawable.inactive_circle_red)
            tabs!!.getTabAt(4)!!.icon = resources.getDrawable(R.drawable.active_red_circle)
            image_subjects_start_screen.visibility = View.GONE
            title_subjects_start_screen.text = "И многое другое"
            title_subjects_start_screen.setTextColor(resources.getColor(R.color.red))
            additional_subjects.visibility = View.VISIBLE
        }

    }
}
package com.example.recycleviewexemplo.ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.recycleviewexemplo.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager2
    lateinit var fragmentAdapter: FragmentAdapter

    lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        viewPager = findViewById(R.id.view_pager)
        fragmentAdapter = FragmentAdapter(this)
        viewPager.adapter = fragmentAdapter

        tabs = findViewById(R.id.tabs)
        TabLayoutMediator(tabs,viewPager){tab, position ->
            if (position == 0) {
                tab.text = "Salgados"
            }
            else if (position == 1) {
                tab.text = "Doces"
            }
            else {
                tab.text = "Bebidas"
            }
        }.attach()

    }

    inner class FragmentAdapter(fragmentActivity: FragmentActivity)
        : FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return 3
        }

        override fun createFragment(position: Int): Fragment {
            return when(position){
                0 -> Fragment01()
                1 -> Fragment02()
                else -> Fragment03()
            }
        }

    }
}
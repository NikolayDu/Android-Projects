package com.example.pictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pictures.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val fragList = listOf(
        RandomFragment.newInstance(),
        FavoriteFragment.newInstance()
    )

    private val fragListTitles = listOf(
        "Random",
        "Favorite",
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = VpAdapter(this, fragList)
        binding.ViewPager2.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.ViewPager2) {
            tab, pos -> tab.text = fragListTitles[pos]
        }.attach()



    }
}
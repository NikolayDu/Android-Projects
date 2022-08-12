package com.example.pictures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class RandomFragment : Fragment() {
    private var listView: ListView? = null
    private var cAdapter: ListViewAdapter? = null
    private var fruitsImage = intArrayOf(R.drawable.apple, R.drawable.banana, R.drawable.berry,
        R.drawable.cherry, R.drawable.fig, R.drawable.grapes, R.drawable.honewdew,
        R.drawable.jackfruits, R.drawable.kiwi, R.drawable.lime, R.drawable.plum)
    private var fruitsName = arrayOf("Apple", "Banana", "Berry", "Cherry", "Fig",
        "Grapes", "Honeydew", "Jack Fruits", "Kiwi", "Lime", "Plum")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_random, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = RandomFragment()
    }
}
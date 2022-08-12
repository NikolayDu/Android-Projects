package com.example.pictures20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun randomPic(view: View, ) {
        val randomIntent = Intent(this, RandomActivity::class.java)
        startActivity(randomIntent)
    }

    fun favoritePic(view: View){
        val favoriteIntent = Intent(this, FavoriteActivity::class.java)
        startActivity(favoriteIntent)
    }
}
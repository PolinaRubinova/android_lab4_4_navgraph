package com.example.lab3_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_5.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)
//        val binding = ActivityAboutBinding.inflate(layoutInflater)
//        setContentView(binding.root)
    }
}
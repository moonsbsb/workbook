package com.example.umc1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.umc1.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {


    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.imageView.setOnClickListener {
            val intent = Intent(this, PageActivity::class.java)
            startActivity(intent)
        }

    }
}


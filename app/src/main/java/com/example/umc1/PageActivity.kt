package com.example.umc1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.umc1.databinding.ActivityPageBinding

class PageActivity:AppCompatActivity() {

    val pBinding by lazy {
        ActivityPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(pBinding.root)
    }
}
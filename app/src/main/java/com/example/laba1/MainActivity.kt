package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.laba1.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.knopka1.setOnClickListener() {
            val text = bindingClass.text2.text
            bindingClass.text1.text = text
        }
    }
}
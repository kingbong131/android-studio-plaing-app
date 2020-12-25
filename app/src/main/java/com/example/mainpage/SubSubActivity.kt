package com.example.mainpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubSubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_sub)

        val btnBack: Button = findViewById(R.id.backbutton1)

        btnBack.setOnClickListener {
            finish()
        }
    }
}
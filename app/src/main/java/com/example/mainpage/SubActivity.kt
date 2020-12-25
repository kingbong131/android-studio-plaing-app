package com.example.mainpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val btnBack: Button = findViewById(R.id.btn_a)
        val button2: Button = findViewById(R.id.button2)
        
        btnBack.setOnClickListener {
            finish()
        }
        val thirdIntent = Intent(this, SubSubActivity::class.java)
        button2.setOnClickListener{
            startActivity(thirdIntent)
        }
    }
}
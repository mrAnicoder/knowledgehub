package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById<Button>(R.id.btnGo)
        btnGo.setOnClickListener {
            //opening techknowledge
            intent = Intent(applicationContext, TechKnowledge::class.java )
            startActivity(intent)
        }
    }
}
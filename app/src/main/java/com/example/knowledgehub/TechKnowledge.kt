package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class TechKnowledge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_knowledge)

        val callUsBtn = findViewById<Button>(R.id.callBtn)

        callUsBtn.setOnClickListener {

            val phoneNumber = "6386154386"

            intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: $phoneNumber")
            startActivity(intent)
        }
        androidKnowledge()
        iosKnowledge()
        webDevKnowledge()
        uiKnowledge()
        aiKnowledge()
        hackingKnowledge()
    }
    // 1. this private fun is a intent for android knowledge page
    private fun androidKnowledge() {
        val androidButton = findViewById<CardView>(R.id.androidBtn)

        androidButton.setOnClickListener {

            val androidBtnIntent = Intent(applicationContext, android_roadmap::class.java)
            startActivity(androidBtnIntent)
        }
    }
    // 2. this private fun is a intent for ios knowledge page
    private fun iosKnowledge() {
        val androidButton = findViewById<CardView>(R.id.iosBtn)

        androidButton.setOnClickListener {

            val iosBtnIntent = Intent(applicationContext,ios_roadmap::class.java)
            startActivity(iosBtnIntent)
        }
    }
    // 3. this private fun is a intent for web development knowledge page
    private fun webDevKnowledge() {
        val webDevButton = findViewById<CardView>(R.id.webDevBtn)

        webDevButton.setOnClickListener {

            val webDevIntent = Intent(applicationContext, webDev_roadmap::class.java)
            startActivity(webDevIntent)
        }
    }
    // 4. this private fun is a intent for UI development knowledge page
    private fun uiKnowledge() {
        val uiDevButton = findViewById<CardView>(R.id.uiBtn)

        uiDevButton.setOnClickListener {

            val uiDevIntent = Intent(applicationContext, uxDesign_roadmap::class.java)
            startActivity(uiDevIntent)
        }
    }
    //5. this private fun is a intent for AI development knowledge page
    private fun aiKnowledge() {
        val aiDevButton = findViewById<CardView>(R.id.aiBtn)

        aiDevButton.setOnClickListener {

            val aiDevIntent = Intent(applicationContext, ai_learning_roadmap::class.java)
            startActivity(aiDevIntent)
        }
    }
    // 6. this private fun is a intent for Hacking course knowledge page
    private fun hackingKnowledge() {
        val hackingButton = findViewById<CardView>(R.id.hackingBtn)

        hackingButton.setOnClickListener {

            val hackIntent = Intent(applicationContext, hacking_roadmap::class.java)
            startActivity(hackIntent)
        }
    }

    private fun dialCall(){

    }
}
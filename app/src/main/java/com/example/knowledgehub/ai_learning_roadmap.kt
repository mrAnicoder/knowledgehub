package com.example.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class ai_learning_roadmap : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_learning_roadmap)

        val aiLearning = findViewById<WebView>(R.id.aiWebView)
        aiView(aiLearning)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun aiView(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://aws.amazon.com/training/digital/")
        }
    }
}
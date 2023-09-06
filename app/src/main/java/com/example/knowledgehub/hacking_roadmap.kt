package com.example.knowledgehub

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class hacking_roadmap : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hacking_roadmap)

        val hackingWebViews = findViewById<WebView>(R.id.hackingWebView)
        hackingView(hackingWebViews)
    }
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun hackingView(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.udemy.com/topic/ethical-hacking/free/")
        }
    }
}
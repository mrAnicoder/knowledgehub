package com.example.knowledgehub

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class android_roadmap : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anroid_rodmap)

        val androidWebView = findViewById<WebView>(R.id.androidView)
        androidview(androidWebView)

    }

@SuppressLint("SetJavaScriptEnabled")
@RequiresApi(Build.VERSION_CODES.O)
private fun androidview(webView: WebView){
    webView.webViewClient = WebViewClient()

    webView.apply {
        settings.javaScriptEnabled = true
        settings.safeBrowsingEnabled = true
        loadUrl("https://developer.android.com/courses")
    }
  }
}
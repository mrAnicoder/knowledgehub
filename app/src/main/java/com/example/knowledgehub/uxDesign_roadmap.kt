package com.example.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class uxDesign_roadmap : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ux_design_roadmap)

        val uxDesign = findViewById<WebView>(R.id.uxWebView)
        uxView(uxDesign)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun uxView(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.coursera.org/learn/introtoux-principles-and-processes?specialization=michiganux&utm_medium=institutions&utm_source=umich&utm_content=sem&utm_campaign=adwords-ux-introtoux-principles-and-processes&utm_term=ui%20ux%20free%20online%20courses&gad=1&gclid=")
        }
    }
}
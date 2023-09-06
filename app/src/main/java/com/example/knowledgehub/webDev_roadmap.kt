package com.example.knowledgehub

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class webDev_roadmap : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev_roadmap)

        val webdevWebView = findViewById<WebView>(R.id.websiteWebView)
        websiteView(webdevWebView)

    }
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun websiteView(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.udemy.com/courses/design/?utm_source=adwords&utm_medium=udemyads&utm_campaign=DSA_Catchall_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_82569850245_._ad_533220805577_._kw__._de_c_._dm__._pl__._ti_aud-1738475842996:dsa-405446987715_._li_9144716_._pd__._&matchtype=&gclid=CjwKCAjw3dCnBhBCEiwAVvLcuzYBHnXyKThoVt1Fj2urNJRsOToIs7W5BXbK9rpSHuDc_nYZjtLBxBoCEAsQAvD_BwE")
        }
    }
}
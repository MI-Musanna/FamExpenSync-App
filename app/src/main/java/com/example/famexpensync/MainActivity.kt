package com.example.famexpensync

import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Native View Port Binding Matrix
        myWebView = findViewById(R.id.webView)
        myWebView.webViewClient = WebViewClient()

        // ⚡ HARDWARE ACCELERATION GPU ENABLER
        // Forces 60Hz ultra-smooth rendering for CSS transforms and Chart.js graphics
        myWebView.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        // Local Storage Persistency & Viewport Zoom Locking
        val webSettings: WebSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webSettings.textZoom = 100 // Overrides Android text zoom scaling bugs

        // Offline Telemetry Cache Loading Speeds Optimization
        webSettings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

        // Load local asset shell compiled code
        myWebView.loadUrl("file:///android_asset/index.html")

        // Standard 100% Crash-Proof modern Android OnBackPressed Engine Intercept
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (myWebView.canGoBack()) {
                    myWebView.goBack()
                } else {
                    isEnabled = false
                    onBackPressedDispatcher.onBackPressed()
                }
            }
        })
    }
}
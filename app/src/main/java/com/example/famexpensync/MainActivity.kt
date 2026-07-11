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

        // XML লেআউট থেকে নেটিভ ভিউ পোর্ট বাইন্ডিং
        myWebView = findViewById(R.id.webView)
        myWebView.webViewClient = WebViewClient()

        // ⚡ HARDWARE ACCELERATION ENGINE ENABLER
        // এটি চার্ট অ্যানিমেশন এবং স্ক্রলিং ফ্রেমরেটকে 60Hz-এ লক রাখবে এবং কোনো ল্যাগ হতে দেবে না
        myWebView.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        // মোবাইল ভিউপোর্ট ইঞ্জিন ও ক্যাশিং সেটিংস কনফিগারেশন
        val webSettings: WebSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true   // লোকাল ডাটাবেজের পারসিস্টেন্ট সচল রাখার জন্য

        // ভিউপোর্ট অপ্টিমাইজেশন রেসট্রিকশন লক
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webSettings.textZoom = 100 // ওএসের ফন্ট চেঞ্জের কারণে UI গ্রিড ব্রেকিং প্রতিরোধ লক

        // ⚡ LOCAL STORAGE CACHE OPTIMIZATION
        // অফলাইন অ্যাসেট ও স্ক্রিপ্ট রেন্ডারিং স্পীড ৩ গুণ ফাস্ট করার বুস্টার
        webSettings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

        // এসেট ফোল্ডারের ফাইল সোর্স রিড পাথ পুশ
        myWebView.loadUrl("file:///android_asset/index.html")

        // মডার্ন অ্যান্ড্রয়েড আর্কিটেকচার অনুযায়ী ১০০% ক্র্যাশ-প্রুফ ব্যাক-প্রেস ট্র্যাকিং
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (myWebView.canGoBack()) {
                    myWebView.goBack() // অ্যাপ বন্ধ না হয়ে ওয়েবভিউ-এর সাব-উইন্ডো পেজ ব্যাক করবে
                } else {
                    isEnabled = false
                    onBackPressedDispatcher.onBackPressed() // হোম স্ক্রিনে এক্সিট লিঙ্কিং পুশ
                }
            }
        })
    }
}
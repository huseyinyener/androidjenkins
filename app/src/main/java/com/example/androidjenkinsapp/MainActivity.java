package com.example.androidjenkinsapp;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // WebView'i bul
        webView = findViewById(R.id.webView);

        // WebView için ayarları yapılandır
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // JavaScript'i etkinleştir

        // WebViewClient kullanarak WebView'i ayarla
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Log.e("WebView Error", "Error Code: " + errorCode + ", Description: " + description);
            }
        });

        // WebView'e bir web sayfasını yükle
        webView.loadUrl("https://bestcloudfor.me");
    }
}
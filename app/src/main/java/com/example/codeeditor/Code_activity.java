package com.example.codeeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Code_activity extends AppCompatActivity {

    WebView webView;
    private WebView mWv;
    private Object Code_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_activity);

        webView = findViewById(R.id.web_view);
        webView.loadData(getIntent().getStringExtra("code"),"text/html; charset=utf-8",null);
       // String base = Environment.getExternalStorageDirectory().getAbsolutePath().toString();
//        String html = "<html><head></head><body> <img src=\""+ imagePath + "\"> </body></html>";
  //      webView.loadDataWithBaseURL("", html, "text/html","utf-8", "");

    }
}
package com.pippo.ladolcevita;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        WebView web = new WebView(this);
        web.setWebViewClient(new WebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        web.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
}

package com.irk.javatutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FinalActivity extends AppCompatActivity {
public static final String TAG="FinalActivity";
private Context context;
private Bundle bundle;
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        context=FinalActivity.this;
        webView=findViewById(R.id.webView);
        bundle=getIntent().getExtras();
        if (!bundle.equals(null)){
            String data=bundle.getString("titles");
            Log.d(TAG,"ONcREATE: THE COMING DATA IS"+data);
            String url="file:///android_asset/"+data+".html";
            webView.loadUrl(url);
            WebSettings webSettings= webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true);
        }
    }
}

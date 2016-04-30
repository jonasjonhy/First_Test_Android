package com.example.jonatas.prova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jonatas.provajosias.R;

public class WebViewActivity extends AppCompatActivity {
    private EditText editText;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        editText = (EditText) findViewById(R.id.etUrl);

        webView = (WebView) findViewById(R.id.webView);
        configWebView();

    }

    private void configWebView(){
        webView.setWebViewClient(new CustomWebClient());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
    }

    public void carregarUrl(View view){
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "por favor informe uma url", Toast.LENGTH_SHORT).show();
        }else{
            webView.loadUrl(editText.getText().toString());
        }
    }
    private class CustomWebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return false;
        }
    }
}

package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SamprotikActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samprotik);

        WebView webView = (WebView)findViewById(R.id.webView);
//you can load an html code
//        webView.loadData("yourCode Html to load on the webView " , "text/html" , "utf-8");
// you can load an URL
        webView.loadUrl("http://www.ccc.org.bd/latest-news/");
    }
}

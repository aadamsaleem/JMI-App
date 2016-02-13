package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Events extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		WebView webView;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events);
		webView = (WebView) findViewById(R.id.event);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://192.73.234.205/.umar/jamiapp/events.php");
	}
}

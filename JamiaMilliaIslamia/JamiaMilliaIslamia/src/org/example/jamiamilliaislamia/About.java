package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admission);
		WebView webView = (WebView) findViewById(R.id.admission);
		//webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://192.73.234.205/.umar/jamiapp/about.php");
	}
}

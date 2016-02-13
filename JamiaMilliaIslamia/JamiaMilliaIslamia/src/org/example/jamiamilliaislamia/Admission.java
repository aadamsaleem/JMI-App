package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Admission extends Activity {
	private WebView webView;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.admission);

		webView = (WebView) findViewById(R.id.admission);
		//webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/web/study.html");

	}
}

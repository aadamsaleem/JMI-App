package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Notices extends Activity {
	private WebView webView;
	int a;
	String[] category = { "Admission", "Examination", "Statues&Ordinances",
			"Financial", "Administrative", "General" };
	int cat;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.notice);
		final Spinner spin1 = (Spinner) findViewById(R.id.location);
		webView = (WebView) findViewById(R.id.maper);
		webView.getSettings().setJavaScriptEnabled(true);

		Button addButton = (Button) findViewById(R.id.search);
		ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, category);
		spinAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin1.setAdapter(spinAdapter);
		spin1.setSelection(0);
		webView.loadUrl("http://192.73.234.205/.umar/jamiapp/notice.php");

		addButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				a = spin1.getSelectedItemPosition();
				switch (a) {
				case 0:
					cat = 1;
					break;
				case 1:
					cat = 6;
					break;
				case 2:
					cat = 5;
					break;
				case 3:
					cat = 7;
					break;
				case 4:
					cat = 8;
					break;
				case 5:
					cat = 9;
					break;
				}
				webView.loadUrl("http://192.73.234.205/.umar/jamiapp/notice.php?cat="
						+ cat);

			}
		});

	}
}
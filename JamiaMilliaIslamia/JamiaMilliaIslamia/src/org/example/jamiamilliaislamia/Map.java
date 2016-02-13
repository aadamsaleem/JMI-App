package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Map extends Activity {
	private WebView webView;
	int a;
	String[] loca = { "College", "Faculty of Engg.", "Proctor Office",
			"Library", "Sports Complex", "Dentistry", "Bus Stand",
			"Ansari Health Center", "University Polytechnic",
			"Center for Physiotherapy", "Mass Comm.", "Jamia School",
			"Indian Bank", "Hostel Entry", "Central Canteen",
			"Art Gallery", "Fx Uth Point" };

	final String[] coord = { "28.56134,77.28146", "28.56031,77.27952",
			"28.56148,77.28367", "28.56154,77.28226", "28.56216,77.27895",
			"28.56428,77.27921", "28.56092,77.27999", "28.56235,77.28556",
			"28.56315,77.28145", "28.55955,77.28105", "28.55956,77.28442",
			"28.563651,77.282606", "28.561264,77.279679",
			"28.564916,77.280758", "28.562018,77.280225",
			"28.558975,77.283158", "28.559005,77.283561" };

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		final Spinner spin1 = (Spinner) findViewById(R.id.location);
		final TextView ed=(TextView) findViewById(R.id.testing);
		webView = (WebView) findViewById(R.id.maper);
		webView.getSettings().setJavaScriptEnabled(true);
		
		Button addButton = (Button) findViewById(R.id.search);
		ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, loca);
		spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin1.setAdapter(spinAdapter);
		spin1.setSelection(0);
		webView.loadUrl("https://maps.google.com/maps?q="+coord[0]);
		ed.setText("https://maps.google.com/maps?q="+coord[0]+"&z=20");
		addButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				a = spin1.getSelectedItemPosition();
				System.out.print(coord[a]);
				ed.setText("https://maps.google.com/maps?q=" + coord[a]);
				webView.loadUrl("https://maps.google.com/maps?q=" + coord[a]+"&z=20");

			}
		});

	}
}
package org.example.jamiamilliaislamia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Notification extends Activity {
	private String text = "";
	BufferedReader reader;
	HttpURLConnection urlConnection;
    
	private int count = 0;
	
	String a,b;
	
	
	
	public void setSite() {
		String c="",inputLine;
		//TextView ed=(TextView) findViewById(R.id.editText1);
		c="http://192.73.234.205/.umar/jamiapp/notification.php?year="+a+"&month="+b;
		//ed.setText("");
		count=0;
		try {
			try {
				URL url = new URL(c);
				urlConnection = (HttpURLConnection) url.openConnection();
				reader = new BufferedReader(new InputStreamReader(
						urlConnection.getInputStream()));

				
				while ((inputLine = reader.readLine()) != "") {
					text = text + inputLine;
					//System.out.println(inputLine);
					if (inputLine.contains("href")) {
						count++;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			//ed = (TextView) findViewById(R.id.editText1);
			//ed.setText("link="+c+"\nCOUNT=" + count);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		WebView webView = (WebView) findViewById(R.id.noti);
		//webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(c);
		
	}
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);
		int i,curYear,curMon;
		curYear=Calendar.getInstance().get(Calendar.YEAR);
		curMon=Calendar.getInstance().get(Calendar.MONTH);
		curMon++;
		String[] Year = new String [5];
		
		//Populating the spinner array
		for (i=curYear;i>curYear-5;i--)
		   Year[curYear-i]=Integer.toString(i);
		
		final Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
		final Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
		
		a=Integer.toString(curYear);
		b=Integer.toString(curMon);
		//a = spin1.getSelectedItem().toString();
		//b = spin2.getSelectedItem().toString();
		Button addButton = (Button) findViewById(R.id.button1);
		ArrayAdapter<String> spinAdapter =  new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,  Year);
		spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin1.setAdapter(spinAdapter);
		spin1.setSelection(0);
		spin2.setSelection(curMon-1);
		setSite();
		
		
		addButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				a = spin1.getSelectedItem().toString();
				b = spin2.getSelectedItem().toString();
				
				setSite();
				
		}});
		
		
	}

}
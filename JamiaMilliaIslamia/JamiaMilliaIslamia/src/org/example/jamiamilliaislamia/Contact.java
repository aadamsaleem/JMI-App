package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Contact extends Activity{
	private ImageButton but1,but2,but3,but4,but5;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		but1=(ImageButton)findViewById(R.id.call1);
		but2=(ImageButton)findViewById(R.id.call2);
		but3=(ImageButton)findViewById(R.id.call3);
		but4=(ImageButton)findViewById(R.id.call4);
		but5=(ImageButton)findViewById(R.id.call5);
		but1.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:"+getString(R.string.ph1)));
				startActivity(callIntent);
 
			}
 
		});
		but2.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:"+getString(R.string.ph2)));
				startActivity(callIntent);
 
			}
 
		});
		but3.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:"+getString(R.string.ph3)));
				startActivity(callIntent);
 
			}
 
		});
		but4.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:"+getString(R.string.ph4)));
				startActivity(callIntent);
 
			}
 
		});
		but5.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:"+getString(R.string.ph5)));
				startActivity(callIntent);
 
			}
 
		});
		
	}
}




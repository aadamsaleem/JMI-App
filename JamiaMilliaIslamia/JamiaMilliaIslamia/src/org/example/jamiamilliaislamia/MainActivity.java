package org.example.jamiamilliaislamia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton imageButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ButtonAdapter(this));
        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //Toast.makeText(MainActivity.this, "Hello" + position, Toast.LENGTH_SHORT).show();
                switch (position)
                {
                case 0:startActivity(new Intent(MainActivity.this, Notices.class));
                break;
                case 1:startActivity(new Intent(MainActivity.this, Notification.class));
                break;
                case 2:startActivity(new Intent(MainActivity.this, Events.class));
                break;
                case 3:startActivity(new Intent(MainActivity.this, Press.class));
                break;
                case 4:startActivity(new Intent(MainActivity.this, Admission.class));
                break;
                case 5:startActivity(new Intent(MainActivity.this, HelpLine.class));
                break;
                case 6:startActivity(new Intent(MainActivity.this, Map.class));
                break;
                case 7:startActivity(new Intent(MainActivity.this, Contact.class));
                break;
                case 8:startActivity(new Intent(MainActivity.this, About.class));
                break;
                case 9:finish();
                break;
                
                }
            }
        });
		

	

	}

}
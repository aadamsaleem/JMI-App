package org.example.jamiamilliaislamia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ButtonAdapter extends BaseAdapter {
	private Context mContext;
	

	public ButtonAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return but.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return position;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		View gridView;
		LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {
			// if it's not recycled, initialize some attributes
			gridView =new  View(mContext); 
			gridView = inflater.inflate(R.layout.button, null);
			
			
		}
		else {
			gridView = (View) convertView;
		}
		ImageView button= (ImageView) gridView.findViewById(R.id.opt);
		button.setImageResource(but[position]);
		TextView textView=(TextView) gridView.findViewById(R.id.text);
		textView.setText(text[position]);

		return gridView;
	}

	public Integer[] but={R.drawable.announce,R.drawable.notification,R.drawable.events,R.drawable.press,R.drawable.admission,R.drawable.helpicon,
			R.drawable.maps,R.drawable.contact,R.drawable.about,R.drawable.exit};
	public String[] text={"Announcements","Notifications","Events","Press Releases","Study at Jamia","Help-line","Map","Contact Us","About","Exit"};

	

}

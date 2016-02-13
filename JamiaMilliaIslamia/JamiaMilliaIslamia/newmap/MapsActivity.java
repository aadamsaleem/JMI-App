package org.example.jamiamilliaislamia;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.maps.MapActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.*;

@SuppressLint("NewApi")
public class MapsActivity extends FragmentActivity {

	// coordinates
	private static final LatLng Jamia = new LatLng(28.5613432, 77.2814605);
	private static final LatLng Engg = new LatLng(28.5602595, 77.2794854);
	private static final LatLng Proc = new LatLng(28.5614785, 77.2836675);
	private static final LatLng Lib = new LatLng(28.5626227, 77.2817990);
	private static final LatLng Sport = new LatLng(28.5621807, 77.2789467);
	private static final LatLng Dent = new LatLng(28.5642721, 77.2792084);
	private static final LatLng Polit = new LatLng(28.5618546, 77.2809443);
	private static final LatLng Physio = new LatLng(28.5595691, 77.2810336);
	private static final LatLng Mass = new LatLng(28.5595619, 77.2844231);
	private static final LatLng School = new LatLng(28.5631713, 77.2846127);
	private static final LatLng Mang = new LatLng(28.5584279, 77.2814048);
	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapj);
		// map fragment
		android.support.v4.app.FragmentManager fmanager = getSupportFragmentManager();
		Fragment fragment = fmanager.findFragmentById(R.id.map);
		SupportMapFragment supportmapfragment = (SupportMapFragment) fragment;
		mMap = supportmapfragment.getMap();
		

		// adding markers
		Marker jamia = mMap.addMarker(new MarkerOptions().position(Jamia)
				.title("Jamia Millia Islamia"));
		Marker engg = mMap.addMarker(new MarkerOptions().position(Engg).title(
				"Faculty Of Engineering"));
		Marker proc = mMap.addMarker(new MarkerOptions().position(Proc).title(
				"Proctors Office"));
		Marker lib = mMap.addMarker(new MarkerOptions().position(Lib).title(
				"Dr. Zakir Hussain Library"));
		Marker sport = mMap.addMarker(new MarkerOptions().position(Sport)
				.title("Sports Complex"));
		Marker dent = mMap.addMarker(new MarkerOptions().position(Dent).title(
				"Faculty Of Dentistry"));
		Marker polit = mMap.addMarker(new MarkerOptions().position(Polit)
				.title("Department of Political Studies"));
		Marker physio = mMap.addMarker(new MarkerOptions().position(Physio)
				.title("Physiotherapy Departmant"));
		Marker mass = mMap.addMarker(new MarkerOptions().position(Mass).title(
				"Mass Communication & Research Centre"));
		Marker school = mMap.addMarker(new MarkerOptions().position(School)
				.title("Jamia School"));
		Marker mang = mMap.addMarker(new MarkerOptions().position(Mang).title(
				"Centre for Management Studies"));

		// camera position
		CameraPosition cameraPosition = new CameraPosition.Builder()
				.target(Jamia) // Sets the center of the map to Mountain View
				.zoom(17) // Sets the zoom
				.bearing(90) // Sets the orientation of the camera to east
				.tilt(30) // Sets the tilt of the camera to 30 degrees
				.build(); // Creates a CameraPosition from the builder
		mMap.animateCamera(CameraUpdateFactory
				.newCameraPosition(cameraPosition));
	}
}
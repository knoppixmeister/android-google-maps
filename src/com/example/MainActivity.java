package com.example;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.*;
import android.support.v4.app.*;

public class MainActivity extends FragmentActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		GoogleMap map = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();

		map.setMyLocationEnabled(false);
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

		map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(56, 24), 13));

		MarkerOptions mo = new MarkerOptions();
		mo.title("Custom Marker Title");
		mo.position(new LatLng(56, 24));

		map.addMarker(mo);

		map.getUiSettings().setCompassEnabled(true);
		//map.getUiSettings().setAllGesturesEnabled(false);
		//map.getUiSettings().setZoomControlsEnabled(false);
	}
}

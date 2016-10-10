package com.example.andrea.proba;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by ANDREA on 10/8/2016.
 */
public class GoogleMapsActivity extends Activity {

    /*private SupportMapFragment sMapFragment;
    GoogleMap mMap;
    private ArrayList<LatLng> latLngs = new ArrayList<LatLng>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_layout);

        Resources res = getResources();
        String[] lok = res.getStringArray(R.array.lokacii);
        Log.d("Lokacija",lok[1]);
        try {
            if (mMap == null) {
                mMap = ((MapFragment) getFragmentManager().
                        findFragmentById(R.id.map)).getMap();
            }
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

            latLngs.add(new LatLng(41.1111153,20.7865056));
            latLngs.add(new LatLng(41.115029,20.7942148));
            latLngs.add(new LatLng(41.1147784,20.7900628));
            latLngs.add(new LatLng(41.1142698,20.7948473));
            latLngs.add(new LatLng(41.1137747,20.7942411));
            latLngs.add(new LatLng(41.1141021,20.7955983));
            latLngs.add(new LatLng(41.1133544,20.7957163));
            latLngs.add(new LatLng(41.1125629,20.7958238));
            latLngs.add(new LatLng(41.1128492,20.7948688));
            latLngs.add(new LatLng(41.1123501,20.796808));
            latLngs.add(new LatLng(41.112829,20.7922778));
            latLngs.add(new LatLng(41.1111153,20.7865056));
            latLngs.add(new LatLng(41.1390537,20.8186571));
            latLngs.add(new LatLng(41.0831314,20.7932584));
            latLngs.add(new LatLng(40.9488976,20.7658982));
            latLngs.add(new LatLng(40.9155354,20.7388616));
            latLngs.add(new LatLng(41.144578,20.6482332));
            latLngs.add(new LatLng(41.1062544,20.6299129));

            Marker marker1 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(0))
                    .title(lok[0])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker2 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(1))
                    .title(lok[1])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker3 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(2))
                    .title(lok[2])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker4 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(3))
                    .title(lok[3])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker5 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(4))
                    .title(lok[4])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker6 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(5))
                    .title(lok[5])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker7 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(6))
                    .title(lok[6])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker8 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(7))
                    .title(lok[7])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker9 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(8))
                    .title(lok[8])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker10 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(9))
                    .title(lok[9])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker11 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(10))
                    .title(lok[10])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker12 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(11))
                    .title(lok[11])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker13 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(12))
                    .title(lok[12])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker14 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(13))
                    .title(lok[13])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker15 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(14))
                    .title(lok[14])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker16 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(15))
                    .title(lok[15])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker17 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(16))
                    .title(lok[16])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));

            Marker marker18 = mMap.addMarker(new MarkerOptions()
                    .position(latLngs.get(17))
                    .title(lok[17])
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_2unnamed)));



            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLngs.get(0),15));
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }*/
}

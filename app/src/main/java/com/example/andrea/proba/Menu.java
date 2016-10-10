package com.example.andrea.proba;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.andrea.proba.Fragments.GoogleMapFragment;
import com.example.andrea.proba.Fragments.Location10Fragment;
import com.example.andrea.proba.Fragments.Location11Fragment;
import com.example.andrea.proba.Fragments.Location12Fragment;
import com.example.andrea.proba.Fragments.Location13Fragment;
import com.example.andrea.proba.Fragments.Location14Fragment;
import com.example.andrea.proba.Fragments.Location15Fragment;
import com.example.andrea.proba.Fragments.Location16Fragment;
import com.example.andrea.proba.Fragments.Location17Fragment;
import com.example.andrea.proba.Fragments.Location18Fragment;
import com.example.andrea.proba.Fragments.Location3Fragment;
import com.example.andrea.proba.Fragments.Location4Fragment;
import com.example.andrea.proba.Fragments.Location5Fragment;
import com.example.andrea.proba.Fragments.Location6Fragment;
import com.example.andrea.proba.Fragments.Location7Fragment;
import com.example.andrea.proba.Fragments.Location8Fragment;
import com.example.andrea.proba.Fragments.Location9Fragment;
import com.example.andrea.proba.Fragments.LocationOneFragment;
import com.example.andrea.proba.Fragments.LocationTwoFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Menu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,OnMapReadyCallback {
    SupportMapFragment sMapFragment;
    GoogleMap mMap;
    FragmentManager sFM;
    android.support.v4.app.Fragment fragmentMap;
    android.support.v4.app.Fragment fragmentLoc1;
    android.support.v4.app.Fragment fragmentLoc2;
    android.support.v4.app.Fragment fragmentLoc3;
    android.support.v4.app.Fragment fragmentLoc4;
    android.support.v4.app.Fragment fragmentLoc5;
    android.support.v4.app.Fragment fragmentLoc6;
    android.support.v4.app.Fragment fragmentLoc7;
    android.support.v4.app.Fragment fragmentLoc8;
    android.support.v4.app.Fragment fragmentLoc9;
    android.support.v4.app.Fragment fragmentLoc10;
    android.support.v4.app.Fragment fragmentLoc11;
    android.support.v4.app.Fragment fragmentLoc12;
    android.support.v4.app.Fragment fragmentLoc13;
    android.support.v4.app.Fragment fragmentLoc14;
    android.support.v4.app.Fragment fragmentLoc15;
    android.support.v4.app.Fragment fragmentLoc16;
    android.support.v4.app.Fragment fragmentLoc17;
    android.support.v4.app.Fragment fragmentLoc18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        sMapFragment = SupportMapFragment.newInstance();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        sMapFragment.getMapAsync(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, (android.view.Menu) menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        sFM = getSupportFragmentManager();

        if(sMapFragment.isAdded())
            sFM.beginTransaction().hide(sMapFragment).commit();


        if (id == R.id.location_1)
        {
            fragmentLoc1 = new LocationOneFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc1);
            ft.commit();
        }
        else if (id == R.id.location_2)
        {
            fragmentLoc2 = new LocationTwoFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc2);
            ft.commit();
        }
        else if (id == R.id.location_3)
        {
            fragmentLoc3 = new Location3Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc3);
            ft.commit();
        }
        else if (id == R.id.location_4)
        {
            fragmentLoc4 = new Location4Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc4);
            ft.commit();
        }
        else if (id == R.id.location_5)
        {
            fragmentLoc5 = new Location5Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc5);
            ft.commit();

        }
        else if (id == R.id.location_6)
        {
            fragmentLoc6 = new Location6Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc6);
            ft.commit();

        }
        else if (id == R.id.location_7)
        {
            fragmentLoc7 = new Location7Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc7);
            ft.commit();

        }
        else if (id == R.id.location_8)
        {
            fragmentLoc8 = new Location8Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc8);
            ft.commit();

        }
        else if (id == R.id.location_9)
        {
            fragmentLoc9 = new Location9Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc9);
            ft.commit();

        }
        else if (id == R.id.location_10)
        {
            fragmentLoc10 = new Location10Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc10);
            ft.commit();

        }
        else if (id == R.id.location_11)
        {
            fragmentLoc11 = new Location11Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc11);
            ft.commit();

        }
        else if (id == R.id.location_12)
        {
            fragmentLoc12 = new Location12Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc12);
            ft.commit();

        }
        else if (id == R.id.location_13)
        {
            fragmentLoc13 = new Location13Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc13);
            ft.commit();

        }
        else if (id == R.id.location_14)
        {
            fragmentLoc14 = new Location14Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc14);
            ft.commit();

        }
        else if (id == R.id.location_15)
        {
            fragmentLoc15 = new Location15Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc15);
            ft.commit();

        }
        else if (id == R.id.location_16)
        {
            fragmentLoc16 = new Location16Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc16);
            ft.commit();

        }
        else if (id == R.id.location_17)
        {
            fragmentLoc17 = new Location17Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc17);
            ft.commit();

        }
        else if (id == R.id.location_18)
        {
            fragmentLoc18 = new Location18Fragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragmentLoc18);
            ft.commit();

        }
        else if (id == R.id.google_map)
        {
            if(fragmentLoc1.isAdded())
                sFM.beginTransaction().hide(fragmentLoc1).commit();
            else if(fragmentLoc2.isAdded())
                sFM.beginTransaction().hide(fragmentLoc2).commit();
            else if(fragmentLoc3.isAdded())
                sFM.beginTransaction().hide(fragmentLoc3).commit();
            else if(fragmentLoc4.isAdded())
                sFM.beginTransaction().hide(fragmentLoc4).commit();
            else if(fragmentLoc5.isAdded())
                sFM.beginTransaction().hide(fragmentLoc5).commit();
            else if(fragmentLoc6.isAdded())
                sFM.beginTransaction().hide(fragmentLoc6).commit();
            else if(fragmentLoc7.isAdded())
                sFM.beginTransaction().hide(fragmentLoc7).commit();
            else if(fragmentLoc8.isAdded())
                sFM.beginTransaction().hide(fragmentLoc8).commit();
            else if(fragmentLoc9.isAdded())
                sFM.beginTransaction().hide(fragmentLoc9).commit();
            else if(fragmentLoc10.isAdded())
                sFM.beginTransaction().hide(fragmentLoc10).commit();
            else if(fragmentLoc11.isAdded())
                sFM.beginTransaction().hide(fragmentLoc11).commit();
            else if(fragmentLoc12.isAdded())
                sFM.beginTransaction().hide(fragmentLoc12).commit();
            else if(fragmentLoc13.isAdded())
                sFM.beginTransaction().hide(fragmentLoc13).commit();
            else if(fragmentLoc14.isAdded())
                sFM.beginTransaction().hide(fragmentLoc14).commit();
            else if(fragmentLoc15.isAdded())
                sFM.beginTransaction().hide(fragmentLoc15).commit();
            else if(fragmentLoc16.isAdded())
                sFM.beginTransaction().hide(fragmentLoc16).commit();
            else if(fragmentLoc17.isAdded())
                sFM.beginTransaction().hide(fragmentLoc17).commit();
            else if(fragmentLoc18.isAdded())
                sFM.beginTransaction().hide(fragmentLoc18).commit();
            if (!sMapFragment.isAdded())
                sFM.beginTransaction().add(R.id.map, sMapFragment).commit();
            else
                sFM.beginTransaction().show(sMapFragment).commit();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
       /* Resources res = getResources();
        String[] lok = res.getStringArray(R.array.locations);*/
        mMap = googleMap;
        final Marker m1 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1111153,20.7865056))
                .title("Plaosnik")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_1m1)));

        final Marker marker2 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.115029,20.7942148))
//                .title(lok[1])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_1m2)));

        final Marker marker3 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1147784,20.7900628))
//                .title(lok[2])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m3)));

        final Marker marker4 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1142698,20.7948473))
//                .title(lok[3])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m4)));

        final Marker marker5 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1137747,20.7942411))
//                .title(lok[4])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m5)));

        final Marker marker6 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1141021,20.7955983))
//                .title(lok[5])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m6)));

        final Marker marker7 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1133544,20.7957163))
//                .title(lok[6])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m7)));

        final Marker marker8 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1125629,20.7958238))
//                .title(lok[7])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m8)));

        final Marker marker9 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1128492,20.7948688))
//                .title(lok[8])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m9)));

        final Marker marker10 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1123501,20.796808))
//                .title(lok[9])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m10)));

        final Marker marker11 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.112829,20.7922778))
//                .title(lok[10])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m11)));

        final Marker marker12 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1111153,20.7865056))
//                .title(lok[11])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m12)));

        final Marker marker13 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1390537,20.8186571))
//                .title(lok[12])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m13)));

        final Marker marker14 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.0831314,20.7932584))
//                .title(lok[13])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m14)));

        final Marker marker15 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(40.9488976,20.7658982))
//                .title(lok[14])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m15)));

        final Marker marker16 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(40.9155354,20.7388616))
//                .title(lok[15])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m16)));

        final Marker marker17 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.144578,20.6482332))
//                .title(lok[16])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m17)));

        final Marker marker18 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.1062544,20.6299129))
//                .title(lok[17])
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rsz_m18)));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(m1.getPosition(),10));
       mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
           @Override
           public boolean onMarkerClick(Marker marker) {
               if(marker.equals(m1))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc1 = new LocationOneFragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc1);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               }
               else if(marker.equals(marker2))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc2 = new LocationTwoFragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc2);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               }
               else if(marker.equals(marker3))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc3 = new Location3Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc3);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               }
               else if(marker.equals(marker4))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc4 = new Location4Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc4);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               }
               else if(marker.equals(marker5))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc5 = new Location5Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc5);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker6))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc6 = new Location6Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc6);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker7))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc7 = new Location7Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc7);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker8))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc8 = new Location8Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc8);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker9))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc9 = new Location9Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc9);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker10))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc10 = new Location10Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc10);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker11))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc11 = new Location11Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc11);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker12))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc12 = new Location12Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc12);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker13))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc13 = new Location13Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc13);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker14))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc14 = new Location14Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc14);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker15))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc15 = new Location15Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc15);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker16))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc16 = new Location16Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc16);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker17))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc17 = new Location17Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc17);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               } else if(marker.equals(marker18))
               {
                   if(sMapFragment.isAdded())
                       sFM.beginTransaction().hide(sMapFragment).commit();
                   fragmentLoc18 = new Location18Fragment();
                   FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                   ft.replace(R.id.content_frame, fragmentLoc18);
                   ft.commit();
//                   Log.d("MARKER 1","PRVA LOKACIJA");
               }
               return true;
           }
       });
    }

}
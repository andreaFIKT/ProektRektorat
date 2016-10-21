package com.example.andrea.proba.Fragments;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.andrea.proba.R;

/**
 * Created by ANDREA on 10/8/2016.
 */
public class LocationOneFragment extends Fragment {
    WebView web1;
    Button buttonMore;
    Button buttonLess;
    Context context;

    public LocationOneFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_one_fragment, container, false);
        context = getContext();
        web1 = (WebView) v.findViewById(R.id.webView);
//        Log.d("INTERNET",String.valueOf(isNetworkAvailable()));
        web1.setWebViewClient(new WebViewClient());
        web1.setHorizontalScrollBarEnabled(true);
        web1.loadUrl("http://www.fikt.uklo.edu.mk");
        web1.requestFocus();

        /*else if(!isInternetOn())
        {
            web1.setWebViewClient(new WebViewClient());
            web1.setHorizontalScrollBarEnabled(true);
            web1.loadUrl("file:///android_assets/location1_mT");
            web1.requestFocus();
        }*/


        buttonMore = (Button) v.findViewById(R.id.btnMore);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web1.getSettings().setJavaScriptEnabled(true);
                web1.setWebViewClient(new WebViewClient());
                web1.setHorizontalScrollBarEnabled(true);
                web1.loadUrl("http://www.google.com");
                web1.requestFocus();
//                buttonMore.setVisibility(View.GONE);

            }
        });
//        buttonMore.setVisibility(View.VISIBLE);
        buttonLess = (Button)v.findViewById(R.id.btnLess);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.d("INTERNET",String.valueOf(isNetworkAvailable()));
                    web1.getSettings().setJavaScriptEnabled(true);
                    web1.setWebViewClient(new WebViewClient());
                    web1.setHorizontalScrollBarEnabled(true);
                    web1.loadUrl("http://www.fikt.uklo.edu.mk");
                    web1.requestFocus();
//

              /*  else
                {
//                   web1.getSettings().setJavaScriptEnabled(true);
                    web1.setWebViewClient(new WebViewClient());
                    web1.setHorizontalScrollBarEnabled(true);
                    web1.loadUrl("file:///android_assets/plaosnik.html");
                    web1.requestFocus();
                }*/

//                buttonLess.setVisibility(View.GONE);

            }
        });

        return v;
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if(activeNetworkInfo != null && activeNetworkInfo.isConnected())
            return true;

        return false;
    }
}



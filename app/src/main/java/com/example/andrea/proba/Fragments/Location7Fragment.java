package com.example.andrea.proba.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.andrea.proba.R;

/**
 * Created by ANDREA on 10/10/2016.
 */
public class Location7Fragment extends android.support.v4.app.Fragment {
    WebView web7;
    Button buttonMore;
    Button buttonLess;

    public Location7Fragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_7_fragment, container, false);
        web7 = (WebView) v.findViewById(R.id.webViewLoc7);
        web7.setHorizontalScrollBarEnabled(true);
        web7.loadUrl("http://www.fikt.uklo.edu.mk");
        web7.requestFocus();
        buttonMore = (Button) v.findViewById(R.id.btnMoreLoc7);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web7.getSettings().setJavaScriptEnabled(true);
                web7.setWebViewClient(new WebViewClient());
                web7.setHorizontalScrollBarEnabled(true);
                web7.loadUrl("http://www.google.com");
                web7.requestFocus();
//                buttonMore.setVisibility(View.GONE);

            }
        });

        buttonLess = (Button)v.findViewById(R.id.btnLessLoc7);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web7.getSettings().setJavaScriptEnabled(true);
                web7.setWebViewClient(new WebViewClient());
                web7.setHorizontalScrollBarEnabled(true);
                web7.loadUrl("http://www.fikt.uklo.edu.mk");
                web7.requestFocus();
//                buttonLess.setVisibility(View.GONE);

            }
        });

        return v;
    }
}

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
public class Location6Fragment extends android.support.v4.app.Fragment {
    WebView web6;
    Button buttonMore;
    Button buttonLess;

    public Location6Fragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_6_fragment, container, false);
        web6 = (WebView) v.findViewById(R.id.webViewLoc6);
        web6.setHorizontalScrollBarEnabled(true);
        web6.loadUrl("http://www.fikt.uklo.edu.mk");
        web6.requestFocus();
        buttonMore = (Button) v.findViewById(R.id.btnMoreLoc6);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web6.getSettings().setJavaScriptEnabled(true);
                web6.setWebViewClient(new WebViewClient());
                web6.setHorizontalScrollBarEnabled(true);
                web6.loadUrl("http://www.google.com");
                web6.requestFocus();
//                buttonMore.setVisibility(View.GONE);

            }
        });
        buttonMore.setVisibility(View.VISIBLE);
        buttonLess = (Button)v.findViewById(R.id.btnLessLoc6);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web6.getSettings().setJavaScriptEnabled(true);
                web6.setWebViewClient(new WebViewClient());
                web6.setHorizontalScrollBarEnabled(true);
                web6.loadUrl("http://www.fikt.uklo.edu.mk");
                web6.requestFocus();
//                buttonLess.setVisibility(View.GONE);

            }
        });

        return v;
    }
}

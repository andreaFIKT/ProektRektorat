package com.example.andrea.proba.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
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
public class Location4Fragment extends android.support.v4.app.Fragment {
    WebView web4;
    Button buttonMore;
    Button buttonLess;

    public Location4Fragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_4_fragment, container, false);
        web4 = (WebView) v.findViewById(R.id.webViewLoc4);
        web4.setHorizontalScrollBarEnabled(true);
        web4.loadUrl("http://www.fikt.uklo.edu.mk");
        web4.requestFocus();
        buttonMore = (Button) v.findViewById(R.id.btnMoreLoc4);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web4.getSettings().setJavaScriptEnabled(true);
                web4.setWebViewClient(new WebViewClient());
                web4.setHorizontalScrollBarEnabled(true);
                web4.loadUrl("http://www.google.com");
                web4.requestFocus();
//                buttonMore.setVisibility(View.GONE);

            }
        });
        buttonMore.setVisibility(View.VISIBLE);
        buttonLess = (Button)v.findViewById(R.id.btnLessLoc4);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web4.getSettings().setJavaScriptEnabled(true);
                web4.setWebViewClient(new WebViewClient());
                web4.setHorizontalScrollBarEnabled(true);
                web4.loadUrl("http://www.fikt.uklo.edu.mk");
                web4.requestFocus();
//                buttonLess.setVisibility(View.GONE);

            }
        });

        return v;
    }
}

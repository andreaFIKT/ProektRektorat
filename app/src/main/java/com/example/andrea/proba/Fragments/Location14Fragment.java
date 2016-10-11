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
public class Location14Fragment extends android.support.v4.app.Fragment {
    WebView web2;
    Button buttonMore;
    Button buttonLess;

    public Location14Fragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_14_fragment, container, false);
        web2 = (WebView) v.findViewById(R.id.webViewLoc14);
        web2.setHorizontalScrollBarEnabled(true);
        web2.loadUrl("http://www.fikt.uklo.edu.mk");
        web2.requestFocus();
        buttonMore = (Button) v.findViewById(R.id.btnMoreLoc14);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web2.getSettings().setJavaScriptEnabled(true);
                web2.setWebViewClient(new WebViewClient());
                web2.setHorizontalScrollBarEnabled(true);
                web2.loadUrl("http://www.google.com");
                web2.requestFocus();
//                buttonMore.setVisibility(View.GONE);

            }
        });
//        buttonMore.setVisibility(View.VISIBLE);
        buttonLess = (Button)v.findViewById(R.id.btnLessLoc14);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web2.getSettings().setJavaScriptEnabled(true);
                web2.setWebViewClient(new WebViewClient());
                web2.setHorizontalScrollBarEnabled(true);
                web2.loadUrl("http://www.fikt.uklo.edu.mk");
                web2.requestFocus();
//                buttonLess.setVisibility(View.GONE);

            }
        });

        return v;
    }
}

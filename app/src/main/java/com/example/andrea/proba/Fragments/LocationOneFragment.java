package com.example.andrea.proba.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

    public LocationOneFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_one_fragment, container, false);
        web1 = (WebView) v.findViewById(R.id.webView);
        web1.setHorizontalScrollBarEnabled(true);
        web1.loadUrl("http://www.fikt.uklo.edu.mk");
        web1.requestFocus();
        buttonMore = (Button) v.findViewById(R.id.btnMore);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web1.getSettings().setJavaScriptEnabled(true);
                web1.setWebViewClient(new WebViewClient());
                web1.setHorizontalScrollBarEnabled(true);
                web1.loadUrl("http://www.google.com");
                web1.requestFocus();
                buttonMore.setVisibility(View.GONE);

            }
        });
        buttonMore.setVisibility(View.VISIBLE);
        buttonLess = (Button)v.findViewById(R.id.btnLess);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web1.getSettings().setJavaScriptEnabled(true);
                web1.setWebViewClient(new WebViewClient());
                web1.setHorizontalScrollBarEnabled(true);
                web1.loadUrl("http://www.fikt.uklo.edu.mk");
                web1.requestFocus();
                buttonLess.setVisibility(View.GONE);

            }
        });

        return v;
    }
}

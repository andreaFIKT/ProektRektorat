package com.example.andrea.proba.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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
public class Location3Fragment extends android.support.v4.app.Fragment {
    WebView web3;
    Button buttonMore;
    Button buttonLess;
    boolean connA;

    public Location3Fragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_3_fragment, container, false);
        web3 = (WebView) v.findViewById(R.id.webViewLoc3);
        connA = checkNetworkConnection(getContext());
        if(connA)
        {
            web3.setHorizontalScrollBarEnabled(true);
            web3.loadUrl("http://www.fikt.uklo.edu.mk");
            web3.requestFocus();
        }
        else
        {
            web3.setHorizontalScrollBarEnabled(true);
            web3.loadUrl("file:///android_asset/mali_tabli/plaosnik.html");
            web3.requestFocus();
        }

        buttonMore = (Button) v.findViewById(R.id.btnMoreLoc3);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(connA)
                {
                    web3.setHorizontalScrollBarEnabled(true);
                    web3.loadUrl("http://www.google.com");
                    web3.requestFocus();
                }
                else
                {
                    web3.setHorizontalScrollBarEnabled(true);
                    web3.loadUrl("file:///android_asset/mali_tabli/plaosnik.html");
                    web3.requestFocus();
                }

            }
        });

        buttonLess = (Button)v.findViewById(R.id.btnLessLoc3);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(connA)
                {
                    web3.setHorizontalScrollBarEnabled(true);
                    web3.loadUrl("http://www.fikt.uklo.edu.mk");
                    web3.requestFocus();
                }
                else
                {
                    web3.setHorizontalScrollBarEnabled(true);
                    web3.loadUrl("file:///android_asset/mali_tabli/plaosnik.html");
                    web3.requestFocus();
                }

            }
        });

        return v;
    }
    public boolean checkNetworkConnection(Context _context) {
        ConnectivityManager connectivity = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

        }
        return false;
    }
}

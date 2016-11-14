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
public class LocationTwoFragment extends android.support.v4.app.Fragment {
    WebView web2;
    Button buttonMore;
    Button buttonLess;
    boolean connA;
    String linkOff;

    public LocationTwoFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.location_2_fragment, container, false);
        web2 = (WebView) v.findViewById(R.id.webViewLoc2);
        connA = checkNetworkConnection(getContext());
        linkOff = getResources().getString(R.string.loc2_malaTabla_link_offline);
        if(connA==true) {
            web2.setHorizontalScrollBarEnabled(true);
            web2.loadUrl("http://stklimentpath.fikt.edu.mk/gorna-porta.html");
            web2.requestFocus();
        }
        else
        {
            web2.setWebViewClient(new WebViewClient());
            web2.setHorizontalScrollBarEnabled(true);
            web2.loadUrl(linkOff);
            web2.requestFocus();
        }
        buttonMore = (Button) v.findViewById(R.id.btnMoreLoc2);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(connA==true) {
                    web2.setHorizontalScrollBarEnabled(true);
                    web2.loadUrl("http://stklimentpath.fikt.edu.mk/gorna-porta.html");
                    web2.requestFocus();
                }
                else
                {
                    web2.setWebViewClient(new WebViewClient());
                    web2.setHorizontalScrollBarEnabled(true);
                    web2.loadUrl(linkOff);
                    web2.requestFocus();
                }

            }
        });
//        buttonMore.setVisibility(View.VISIBLE);
        buttonLess = (Button)v.findViewById(R.id.btnLessLoc2);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(connA==true) {
                    web2.setHorizontalScrollBarEnabled(true);
                    web2.loadUrl("http://stklimentpath.fikt.edu.mk/gorna-porta.html");
                    web2.requestFocus();
                }
                else
                {
                    web2.setWebViewClient(new WebViewClient());
                    web2.setHorizontalScrollBarEnabled(true);
                    web2.loadUrl(linkOff);
                    web2.requestFocus();
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

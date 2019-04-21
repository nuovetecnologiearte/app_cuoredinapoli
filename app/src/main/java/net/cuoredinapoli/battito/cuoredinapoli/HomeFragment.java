package net.cuoredinapoli.battito.cuoredinapoli;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeFragment extends Fragment {

    private WebView webview;
    private ProgressBar spinner;
    private ImageView splash;

    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);

        webview = (WebView) view.findViewById(R.id.webview);
        splash = (ImageView) view.findViewById(R.id.splash_cuore);
        spinner = (ProgressBar) view.findViewById(R.id.progressBar1);


        webview.setWebViewClient(new CustomWebViewClient() {
                                     @Override
                                     public boolean shouldOverrideUrlLoading(WebView view, String url) {


                                         boolean isLocalUrl = false;
                                         try {
                                             URL givenUrl = new URL(url);
                                             String host = givenUrl.getHost();
                                             if (host.contains("cuoredinapoli.net"))
                                                 isLocalUrl = true;

                                         } catch (MalformedURLException e) {


                                         }
                                         if (isLocalUrl)
                                             return super.shouldOverrideUrlLoading(view, url);
                                         else {
                                             Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                             startActivity(intent);
                                             return true;
                                         }
                                     }
                                 }
        );

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.setBackgroundColor(Color.TRANSPARENT);


        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);


        if (isNetworkAvailable()) {

            webview.loadUrl("https://battito.cuoredinapoli.net");


        } else {
            webview.loadUrl("file:///android_asset/error.html");
        }


        return view;

    }


    private class CustomWebViewClient extends WebViewClient {


        @Override
        public void onPageStarted(WebView webview, String url, Bitmap favicon) {

            webview.setVisibility(WebView.INVISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {

           spinner.setVisibility ( View.GONE );
            splash.setVisibility ( View.GONE );
            webview.setVisibility(WebView.VISIBLE);
            super.onPageFinished(view, url);

        }
    }


    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}

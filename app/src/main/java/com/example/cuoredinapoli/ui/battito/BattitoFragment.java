package com.example.cuoredinapoli.ui.battito;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.cuoredinapoli.R;

public class BattitoFragment extends Fragment {

    private BattitoViewModel battitoViewModel;

    public WebView myWebView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        battitoViewModel =
                ViewModelProviders.of(this).get(BattitoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_battito, container, false);

        myWebView = root.findViewById(R.id.battitoWeb);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://battito.cuoredinapoli.net");

        return root;
    }

}

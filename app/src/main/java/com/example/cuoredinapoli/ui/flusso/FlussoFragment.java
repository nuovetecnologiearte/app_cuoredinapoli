package com.example.cuoredinapoli.ui.flusso;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cuoredinapoli.R;
import com.example.cuoredinapoli.ui.battito.BattitoViewModel;

public class FlussoFragment extends Fragment {

    private FlussoViewModel flussoViewModel;

    public WebView myWebViewinsta;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        flussoViewModel =
                ViewModelProviders.of(this).get(FlussoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_flusso, container, false);

        myWebViewinsta = root.findViewById(R.id.cuoreinsta);
        WebSettings webSettings = myWebViewinsta.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebViewinsta.loadUrl("https://cuoredinapoli.net/cdn/solocuore_app.html");

        Button shareInstagram = root.findViewById(R.id.shareInstagram);
        shareInstagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                if (launchIntent != null)
                {
                    try
                    {
                        startActivity(launchIntent);
                    }
                    catch (ActivityNotFoundException ex) // in case Instagram not installed in your device
                    {
                        ex.printStackTrace();
                    }
                }
            }
        });
        return root;
    }
}
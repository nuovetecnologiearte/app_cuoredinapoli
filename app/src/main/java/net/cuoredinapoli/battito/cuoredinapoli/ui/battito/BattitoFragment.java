package net.cuoredinapoli.battito.cuoredinapoli.ui.battito;

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

import java.util.Locale;

public class BattitoFragment extends Fragment {

    private BattitoViewModel battitoViewModel;

    public WebView myWebView;
    public WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        battitoViewModel =
                ViewModelProviders.of(this).get(BattitoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_battito, container, false);

        myWebView = root.findViewById(R.id.battitoWeb);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        if  (Locale.getDefault().getLanguage().contentEquals("it")){
            myWebView.loadUrl("http://battito.cuoredinapoli.net");
        }
        else {
            myWebView.loadUrl("http://battito.cuoredinapoli.net/en.html");
        }


        myWebView.setWebViewClient(new WebViewClient() {
            @Override public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                myWebView.loadUrl("file:///android_asset/error.html");
            } });

        return root;


}
}
package com.example.cuoredinapoli.ui.progetti;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cuoredinapoli.R;

public class ProgettiFragment extends Fragment {

    private ProgettiViewModel progettiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        progettiViewModel =
                ViewModelProviders.of(this).get(ProgettiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_opzioni, container, false);
        final TextView textView = root.findViewById(R.id.text_opzioni);
        progettiViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
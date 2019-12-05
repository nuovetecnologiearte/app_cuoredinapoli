package com.example.cuoredinapoli.ui.concept;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cuoredinapoli.R;

public class ConceptFragment extends Fragment {

    private ConceptViewModel conceptViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        conceptViewModel =
                ViewModelProviders.of(this).get(ConceptViewModel.class);
        View root = inflater.inflate(R.layout.fragment_concept, container, false);
        return root;
    }
}
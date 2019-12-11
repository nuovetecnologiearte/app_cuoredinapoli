package net.cuoredinapoli.battito.cuoredinapoli.ui.opzioni;

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

public class OpzioniFragment extends Fragment {

    private OpzioniViewModel opzioniViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        opzioniViewModel =
                ViewModelProviders.of(this).get(OpzioniViewModel.class);
        View root = inflater.inflate(R.layout.fragment_opzioni, container, false);
        final TextView textView = root.findViewById(R.id.text_opzioni);
        opzioniViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
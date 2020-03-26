package net.cuoredinapoli.battito.cuoredinapoli.ui.frammenti;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.example.cuoredinapoli.R;

public class FragOpera extends Fragment {

    private FragOperaViewModel fragViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        fragViewModel =
                ViewModelProviders.of(this).get(FragOperaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_frag, container, false);

        return root;


    }
}

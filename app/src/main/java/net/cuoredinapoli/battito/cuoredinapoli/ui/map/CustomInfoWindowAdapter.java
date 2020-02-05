package net.cuoredinapoli.battito.cuoredinapoli.ui.map;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.example.cuoredinapoli.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {


    private MapFragment context;

    public CustomInfoWindowAdapter(MapFragment context){
        this.context = context;
    }

    @Override
    public View getInfoWindow (Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View view = context.getLayoutInflater().inflate(R.layout.fragment_infoview, null);

        TextView tvTitle = view.findViewById(R.id.intestazione);
        TextView snippet = view.findViewById(R.id.snippet);

        tvTitle.setText(marker.getTitle());
        snippet.setText(marker.getSnippet());

        return view;
    }

}


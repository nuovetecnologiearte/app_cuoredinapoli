package net.cuoredinapoli.battito.cuoredinapoli.ui.map;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cuoredinapoli.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {


    private MapFragment context;
    private HashMap<Marker, Drawable> hashMarkImg;
    public CustomInfoWindowAdapter(MapFragment context, HashMap hashMarkImg){
        this.context = context;
        this.hashMarkImg = hashMarkImg;
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
        ImageView anteprima = view.findViewById(R.id.anteprima);

        tvTitle.setText(marker.getTitle());
        snippet.setText(marker.getSnippet());
        anteprima.setImageDrawable(hashMarkImg.get(marker));

        return view;
    }

}


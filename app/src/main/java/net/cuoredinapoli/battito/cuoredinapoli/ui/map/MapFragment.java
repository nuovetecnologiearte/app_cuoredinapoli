package net.cuoredinapoli.battito.cuoredinapoli.ui.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cuoredinapoli.R;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.SupportMapFragment;

import org.w3c.dom.Text;


public class MapFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    GoogleMap mGoogleMap;
    MapView mMapView;
    View mView;

    public MapFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_map, container, false);
        return mView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMapView = mView.findViewById(R.id.navigation_map);
        if (mMapView != null) {
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);

        }

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        MapsInitializer.initialize(getContext());

        mGoogleMap = googleMap;
        BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.marker_cuore);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap marker = Bitmap.createScaledBitmap(b, 84, 129, false);
        //rivenditori
        BitmapDrawable bitmapdrawr=(BitmapDrawable)getResources().getDrawable(R.drawable.marker_shop);
        Bitmap r=bitmapdrawr.getBitmap();
        Bitmap markerr = Bitmap.createScaledBitmap(r, 84, 129, false);

        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);



        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.849938,14.259687)).title("Trattoria Don Vincenzo") .snippet("Via S.Biagio dei librai, 60 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.7875422,14.3736273)).title("Viaggia Quasi Gratis") .snippet("Via Circumvallazione, 163 - Torre del Greco").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.867937,14.268188)).title("I am Caso") .snippet("Via Santi Giovanni e Paolo, 3 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.851687,14.257812)).title("Le Ortensie Guest House") .snippet("Vico Giganti, 20 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.858812,14.282937)).title("Viaggia Quasi Gratis") .snippet("Via Giuseppe Buonocore, 31/33 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.910562,14.268313)).title("La Cantina di Carmine") .snippet("Via Melito, 10 - Arzano").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.850437,14.255312)).title("Pizzeria Sorbillo") .snippet("Via dei Tribunali, 32 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.843188,14.222063)).title("Puok Burger Store (VOL.1)") .snippet("Via Francesco Cilea - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.855937,14.246437)).title("Pizzeria Starita") .snippet("Via Materdei, 27/28 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.850938,14.256812)).title("Pizzeria I Decumani") .snippet("Via dei tribunali, 58 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.843937,14.256312)).title("Ristorante Il Pomodorino") .snippet("Corso Umberto I, 1 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.855812,14.244062)).title("Pizzeria I Due Re") .snippet("Via Ugo Falcando, 14 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.848813,14.254268)).title("Bar San Domenico") .snippet("Piazza San Domenico maggiore, 11 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.849563,14.251812)).title("Caffè dell'Epoca") .snippet("Via Santa Maria di Costantinopoli, 82/83 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.855937,14.256437)).title("Infinity cafè") .snippet("Via Foria, 19 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.860687,14.270063)).title("Pizzeria Sofia") .snippet("Via S. Alfonso de Liguori, 2 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.860312,14.270063)).title("Pasticceria Poderico Napolitano") .snippet("Piazza Luigi Poderico, 2 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.8412411,14.2478052)).title("Tabaccheria") .snippet("Via Emanuele de Deo, 13 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.848813,14.259563)).title("La Figlia del Presidente") .snippet("Via Grande Archivio, 24 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.859312,14.262062)).title("'A Figlia d'o Marenaro") .snippet("Via Foria, 180/182 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.841938,14.247563)).title("Trattoria da Nennella") .snippet("Vico Lungo Teatro Nuovo, 103/105 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.857437,14.253438)).title("Pasticceria Poppella") .snippet("Via Sanità, 147 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.857437,14.252188)).title("Pizzeria Concettina ai Tre Santi") .snippet("Via Arena della Sanità, 7bis - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.850062,14.260562)).title("Pizzeria Il Miracolo") .snippet("Via Vicaria Vecchia, 33/35 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.851187,14.267312)).title("Pizza e Coccos") .snippet("Corso Umberto I, 375 - Napoli").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(34.572562,135.489937)).title("99 Pizza Napoletana Gourmet") .snippet("Minamimikunigaokacho, 3 Chome−4−13 1階 - Osaka").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.843438,14.252937)).title("B&B Folle Città") .snippet("Via Cardinale Guglielmo Sanfelice, 38, 80134 Napoli NA").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.849188,14.250688)).title("Fico caffè") .snippet("Piazza Dante 35-36").icon(BitmapDescriptorFactory.fromBitmap(marker)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.842188,14.248438)).title("Sorelle Talarico") .snippet("Vico Due Porte a Toledo, 39/40, 80134 Napoli NA").icon(BitmapDescriptorFactory.fromBitmap(markerr)));



        CameraPosition NTA = CameraPosition.builder().target(new LatLng(40.855937,14.256437)).zoom(14).bearing(0).tilt(0).build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(NTA));


        CustomInfoWindowAdapter adapter = new CustomInfoWindowAdapter(MapFragment.this);
        googleMap.setInfoWindowAdapter(adapter);



    }


    @Override
    public void onInfoWindowClick(Marker marker) {

    }
}

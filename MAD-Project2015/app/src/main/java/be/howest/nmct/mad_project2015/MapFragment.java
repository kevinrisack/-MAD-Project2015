package be.howest.nmct.mad_project2015;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import be.howest.nmct.mad_project2015.admin.McDonaldAdmin;
import be.howest.nmct.mad_project2015.models.McDonald;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {

    MapView mapView;
    GoogleMap map;

    static final String ARG_MCDONALD = "be.howest.nmct.mad_project2015.MCDONALD";

    McDonald mc;


    public MapFragment() {
        // Required empty public constructor
    }

    public static MapFragment newInstance(String sNaam) {
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putString(ARG_MCDONALD, sNaam);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mc = McDonaldAdmin.getMcDonald(getArguments().getString(ARG_MCDONALD));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_map, container, false);

        TextView txvNaam = (TextView) v.findViewById(R.id.txvNaamMcDonaldsMap);
        txvNaam.setText(mc.getsNaam());

        // Gets the MapView from the XML layout and creates it
        mapView = (MapView) v.findViewById(R.id.mapMcDonalds);
        mapView.onCreate(savedInstanceState);

        // Gets to GoogleMap from the MapView and does initialization stuff
        map = mapView.getMap();

        //Initialisation
        map.setMyLocationEnabled(true); //Huidige positie tonen
        map.getUiSettings().setZoomControlsEnabled(true); //ZoomControls tonen
        map.addMarker(new MarkerOptions().position(mc.getlPosition()).title(mc.getsNaam())); //Marker toevoegen op locatie van McDonald

        // Needs to call MapsInitializer before doing any CameraUpdateFactory calls
        try {
            MapsInitializer.initialize(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Updates the location and zoom of the MapView
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(mc.getlPosition(), 14);
        map.animateCamera(cameraUpdate);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}

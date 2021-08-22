package com.example.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.example.history.databinding.ActivityMapBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    //Create array list of latitude and longtitude of Vietnam locations
    ArrayList<LatLng> locationList = new ArrayList<LatLng>();
    LatLng hcm = new LatLng(10.762622, 106.660172);
    LatLng camau = new LatLng(9.17682, 105.15242);
    LatLng hanoi = new LatLng(21.030653, 105.847130);

    //Create array list of names for markers
    ArrayList<String> title = new ArrayList<String>();

    private GoogleMap mMap;
    private ActivityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Add items to array list
        locationList.add(hcm);
        locationList.add(camau);
        locationList.add(hanoi);

        //Add name to marker
        title.add("Ho Chi Minh");
        title.add("Ca Mau");
        title.add("Ha Noi");

    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions().position(hcm).title("Dinh Doc Lap"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hcm));

        //Marker onClick listener
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(@NonNull Marker marker) {


                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        MapActivity.this, R.style.BottomSheetDialogTheme
                );
                View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.fragment_map_info_display, (ScrollView)findViewById(R.id.bottom_sheet_container)
                        );
                bottomSheetView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MapActivity.this, "Share...", Toast.LENGTH_SHORT).show();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
                return false;
            }
        });
    }

}
package com.example.history;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayEventsActivity extends AppCompatActivity{
// implements OnMapReadyCallback
//    private BottomNavigationView bottomNavigationView;
//    private Fragment selectedFragment;

//    private GoogleMap googleMap;
//    private MapView mapView;
//    private ActivityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_events);

        //Change Event Name

        //Google Map Init
//        mapView = findViewById(R.id.mapView);
//        mapView.onCreate(savedInstanceState);
//
//        mapView.getMapAsync(this);

//        //Initialize BottomNavigationView
//        bottomNavigationView = findViewById(R.id.bottom_navigation_event);
//
//        //Set Main Menu Selected
//        bottomNavigationView.setSelectedItemId(R.id.events_details);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.events_details:
//                        selectedFragment = new FragmentDetails();
//                        break;
//
//                    case R.id.events_events:
//                        selectedFragment = new FragmentEvents();
//                        break;
//
//                    case R.id.events_characters:
//                        selectedFragment = new FragmentCharacters();
//                        break;
//                }
//                if (selectedFragment != null) {
//                    getSupportFragmentManager().beginTransaction().
//                            replace(R.id.fragmentContainer, selectedFragment).commit();
//                }
//                return true;
//            }
//        });
//        getSupportFragmentManager().beginTransaction().
//                replace(R.id.fragmentContainer, new FragmentHome()).commit();
    }
//
//    @Override
//    public void onMapReady(@NonNull GoogleMap googleMap) {
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        mapView.onStart();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        mapView.onResume();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        mapView.onPause();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mapView.onDestroy();
//    }
//
//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        mapView.onSaveInstanceState(outState);
//    }
//
//    @Override
//    public void onLowMemory() {
//        super.onLowMemory();
//        mapView.onLowMemory();
//    }
//
//    public void updateTextView(String toThis) {
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(toThis);
//    }
}
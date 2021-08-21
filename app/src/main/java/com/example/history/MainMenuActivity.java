package com.example.history;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.history.Fragments.FragmentHome;
import com.example.history.Fragments.FragmentProfile;
import com.example.history.Fragments.FragmentSearch;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainMenuActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment selectedFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

//        //Make App Bar Transparent
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        getSupportActionBar().setTitle("");

        //Initialize BottomNavigationView
         bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Main Menu Selected
        bottomNavigationView.setSelectedItemId(R.id.main_menu);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.searchEvent:
                        selectedFragment = new FragmentSearch();
                        break;

                    case R.id.main_menu:
                        selectedFragment = new FragmentHome();
                        break;

                    case R.id.profile:
                        selectedFragment = new FragmentProfile();
                        break;
                }
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.fragmentContainer, selectedFragment).commit();
                }
                return true;
            }
        });
        getSupportFragmentManager().beginTransaction().
                replace(R.id.fragmentContainer, new FragmentHome()).commit();
    }
}
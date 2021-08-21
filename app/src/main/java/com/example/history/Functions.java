package com.example.history;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Functions extends AppCompatActivity {

    public void hideAppBar() {
        getSupportActionBar().hide();
    }

    //Set Appbar To Transparent
    public void AppBarTransparent() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}

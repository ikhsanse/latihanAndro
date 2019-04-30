package com.example.latihanandro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hallo = findViewById(R.id.hallo);
        AlphaAnimation animasiSplash = new AlphaAnimation(0f,1f);

    }
}

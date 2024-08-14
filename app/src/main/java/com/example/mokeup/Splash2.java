package com.example.mokeup;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash2 extends AppCompatActivity {


    private static final Object SPLASH_TIME_OUT = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        ImageView nextArrow = findViewById(R.id.nextArrow);
        nextArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Splash2.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        // Optionally start a delayed transition to the main activity
//        new Handler().postDelayed((Runnable) new Runnable() {
//            @Override
//            public void run() {
//                navigateToMainActivity();
//            }
//        }, (Long) SPLASH_TIME_OUT);
    }

//    private void navigateToMainActivity() {
//
//    }
}
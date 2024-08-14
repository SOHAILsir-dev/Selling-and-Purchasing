package com.example.mokeup;

import static com.example.mokeup.R.id.Profile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView Profile = findViewById(R.id.Profile);

        Profile.setOnClickListener(view -> {
            // TODO: Implement profile page navigation

            // Example:
             Intent intent = new Intent(HomeActivity.this, ProfileEdit.class);
             startActivity(intent);
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button toShop = findViewById(R.id.toShop);
        toShop.setOnClickListener(View -> {
                // Example:
                 Intent intent = new Intent(HomeActivity.this, Shop.class);
                 startActivity(intent);

        });
    }
}
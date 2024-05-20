package com.example.tugasday11;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    ImageButton homeButton, bubbleButton, phoneButton, voomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Inisialisasi ImageButtons
        homeButton = findViewById(R.id.pageButton);
        bubbleButton = findViewById(R.id.bubbleButton);
        phoneButton = findViewById(R.id.phoneButton);
        voomButton = findViewById(R.id.voomButton);

        // Panggil metode untuk mengatur klik listener
        setupButtonClickListeners();
    }

    void setupButtonClickListeners() {
        // Atur listener untuk homeButton
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeButton = new Intent(ProfileActivity.this, BerandaActivity.class);
                startActivity(intentHomeButton);
            }
        });

        // Atur listener untuk bubbleButton
        bubbleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatButton = new Intent(ProfileActivity.this, ChatActivity.class);
                startActivity(intentChatButton);
            }
        });

        // Atur listener untuk phoneButton
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPhoneButton = new Intent(ProfileActivity.this, LogActivity.class);
                startActivity(intentPhoneButton);
            }
        });

        // Atur listener untuk voomButton
        voomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlayButton = new Intent(ProfileActivity.this, LineVoomActivity.class);
                startActivity(intentPlayButton);
            }
        });
    }
}

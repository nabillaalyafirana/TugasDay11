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

public class LogActivity extends AppCompatActivity {

    ImageButton homeButton, bubbleButton, phoneButton, voomButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        // Inisialisasi ImageButtons
        homeButton = findViewById(R.id.pageButton);
        bubbleButton = findViewById(R.id.bubbleButton);
        phoneButton = findViewById(R.id.phoneButton);
        voomButton = findViewById(R.id.voomButton);
        profileButton = findViewById(R.id.profileButton);

        // Panggil metode untuk mengatur klik listener
        setupButtonClickListeners();
    }

    void setupButtonClickListeners() {
        // Atur listener untuk homeButton
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeButton = new Intent(LogActivity.this, BerandaActivity.class);
                startActivity(intentHomeButton);
            }
        });

        // Atur listener untuk bubbleButton
        bubbleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatButton = new Intent(LogActivity.this, ChatActivity.class);
                startActivity(intentChatButton);
            }
        });

        // Atur listener untuk voomButton
        voomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlayButton = new Intent(LogActivity.this, LineVoomActivity.class);
                startActivity(intentPlayButton);
            }
        });

        // Atur listener untuk profileButton
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSettingsButton = new Intent(LogActivity.this, ProfileActivity.class);
                startActivity(intentSettingsButton);
            }
        });
    }
}

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

public class LineVoomActivity extends AppCompatActivity {

    ImageButton homeButton, bubbleButton, phoneButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_voom);

        // Inisialisasi ImageButtons
        homeButton = findViewById(R.id.pageButton);
        bubbleButton = findViewById(R.id.bubbleButton);
        phoneButton = findViewById(R.id.phoneButton);
        profileButton = findViewById(R.id.profileButton);

        // Panggil metode untuk mengatur klik listener
        setupButtonClickListeners();
    }

    void setupButtonClickListeners() {
        // Atur listener untuk homeButton
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeButton = new Intent(LineVoomActivity.this, BerandaActivity.class);
                startActivity(intentHomeButton);
            }
        });

        // Atur listener untuk bubbleButton
        bubbleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatButton = new Intent(LineVoomActivity.this, ChatActivity.class);
                startActivity(intentChatButton);
            }
        });

        // Atur listener untuk phoneButton
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPhoneButton = new Intent(LineVoomActivity.this, LogActivity.class);
                startActivity(intentPhoneButton);
            }
        });

        // Atur listener untuk profileButton
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSettingsButton = new Intent(LineVoomActivity.this, ProfileActivity.class);
                startActivity(intentSettingsButton);
            }
        });
    }
}

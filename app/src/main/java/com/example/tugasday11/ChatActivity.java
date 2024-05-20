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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;

public class ChatActivity extends AppCompatActivity {

    ImageButton bubbleButton, phoneButton, voomButton, profileButton, homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // Inisialisasi ImageButtons
        bubbleButton = findViewById(R.id.bubbleButton);
        phoneButton = findViewById(R.id.phoneButton);
        voomButton = findViewById(R.id.voomButton);
        profileButton = findViewById(R.id.profileButton);
        homeButton = findViewById(R.id.pageButton); // Pastikan ID ini benar

        // Atur padding untuk pageButton
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pageButton), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Panggil metode untuk mengatur klik listener
        setupButtonClickListeners();
    }

    void setupButtonClickListeners() {
        // Atur listener untuk bubbleButton
        bubbleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatButton = new Intent(ChatActivity.this, ChatActivity.class);
                startActivity(intentChatButton);
            }
        });

        // Atur listener untuk phoneButton
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPhoneButton = new Intent(ChatActivity.this, LogActivity.class);
                startActivity(intentPhoneButton);
            }
        });

        // Atur listener untuk voomButton
        voomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlayButton = new Intent(ChatActivity.this, LineVoomActivity.class);
                startActivity(intentPlayButton);
            }
        });

        // Atur listener untuk profileButton
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSettingsButton = new Intent(ChatActivity.this, ProfileActivity.class);
                startActivity(intentSettingsButton);
            }
        });

        // Atur listener untuk homeButton
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeButton = new Intent(ChatActivity.this, BerandaActivity.class);
                startActivity(intentHomeButton);
            }
        });
    }
}



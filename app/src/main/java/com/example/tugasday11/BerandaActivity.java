package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

public class BerandaActivity extends AppCompatActivity {

    ImageButton bubbleButton, phoneButton, voomButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        // Inisialisasi ImageButtons
        bubbleButton = findViewById(R.id.bubbleButton);
        phoneButton = findViewById(R.id.phoneButton);
        voomButton = findViewById(R.id.voomButton);
        profileButton = findViewById(R.id.profileButton);

        // Panggil metode untuk mengatur klik listener
        klik();
    }

    void klik() {
        // Atur listener untuk bubbleButton
        bubbleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchatButton = new Intent(BerandaActivity.this, ChatActivity.class);
                startActivity(intentchatButton);
            }
        });

        // Atur listener untuk phoneButton
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentphoneButton = new Intent(BerandaActivity.this, LogActivity.class);
                startActivity(intentphoneButton);
            }
        });

        // Atur listener untuk voomButton
        voomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentplayButton = new Intent(BerandaActivity.this, LineVoomActivity.class);
                startActivity(intentplayButton);
            }
        });

        // Atur listener untuk profileButton
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsettingsButton = new Intent(BerandaActivity.this, ProfileActivity.class);
                startActivity(intentsettingsButton);
            }
        });
    }
}

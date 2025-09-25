package com.yamidev.actividad6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PlayGround extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playground);  // ⚡ aquí debe ir tu layout correcto

        Button homeButton = findViewById(R.id.ibHome);

        homeButton.setOnClickListener(v -> {
            Toast.makeText(PlayGround.this, "Click detectado!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(PlayGround.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }



}

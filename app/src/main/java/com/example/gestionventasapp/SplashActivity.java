package com.example.gestionventasapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Usamos Handler para esperar unos segundos antes de redirigir a LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Redirigir a LoginActivity después de 2 segundos
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Esto cierra la pantalla Splash
            }
        }, 2000); // 2000 ms = 2 segundos
    }
}


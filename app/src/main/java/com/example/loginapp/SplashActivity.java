package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Logoyu fade-in animasyonu ile göster
        ImageView splashLogo = findViewById(R.id.splashLogo); // activity_splash.xml'deki logo ID'si
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        splashLogo.startAnimation(fadeInAnimation);

        // Splash ekranını belirli bir süre göster ve ardından LoginActivity'e geç
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Splash ekranını kapat
        }, 3000); // 3 saniye bekleme süresi
    }
}

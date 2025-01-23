package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    // Sabit kullanıcı adı ve şifre
    private final String VALID_USERNAME = "admin";
    private final String VALID_PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Tasarım elemanlarını tanımla
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        // Giriş Yap butonuna tıklama olayı
        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Kullanıcı adı ve şifre doğrulama
            if (TextUtils.isEmpty(username)) {
                Toast.makeText(LoginActivity.this, "Lütfen kullanıcı adını girin", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(LoginActivity.this, "Lütfen şifreyi girin", Toast.LENGTH_SHORT).show();
                return;
            }

            if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                // Başarılı giriş, Ana Sayfa'ya geç
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Login ekranını kapat
            } else {
                // Hatalı giriş
                Toast.makeText(LoginActivity.this, "Kullanıcı adı veya şifre hatalı", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

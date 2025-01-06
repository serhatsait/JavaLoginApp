//package com.example.loginapp;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//
//    // Sabit kullanıcı adı ve şifre
//    private static final String USERNAME = "admin";
//    private static final String PASSWORD = "1234";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Tasarım elementlerine erişim
//        EditText userEditText = findViewById(R.id.userEditText);
//        EditText passwordEditText = findViewById(R.id.passwordEditText);
//        Button loginButton = findViewById(R.id.loginButton);
//
//        // Butona tıklanma işlemi
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Kullanıcı girişlerini alma
//                String enteredUsername = userEditText.getText().toString();
//                String enteredPassword = passwordEditText.getText().toString();
//
//                // Giriş kontrolü
//                if (USERNAME.equals(enteredUsername) && PASSWORD.equals(enteredPassword)) {
//                    Toast.makeText(MainActivity.this, "Giriş Başarılı!", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Kullanıcı adı veya şifre hatalı!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//}

package com.example.loginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Sabit kullanıcı adı ve şifre
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tasarım elemanlarını tanımlama
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        // Butona tıklanma işlemi
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kullanıcıdan alınan değerler
                String enteredUsername = usernameEditText.getText().toString().trim();
                String enteredPassword = passwordEditText.getText().toString().trim();

                // Kullanıcı adı ve şifre kontrolü
                if (!enteredUsername.equals(CORRECT_USERNAME)) {
                    // Kullanıcı adı yanlışsa hata mesajı göster
                    Toast.makeText(MainActivity.this, "Hatalı kullanıcı adı!", Toast.LENGTH_SHORT).show();
                } else if (!enteredPassword.equals(CORRECT_PASSWORD)) {
                    // Şifre yanlışsa hata mesajı göster
                    Toast.makeText(MainActivity.this, "Hatalı şifre!", Toast.LENGTH_SHORT).show();
                } else {
                    // Giriş başarılıysa mesaj göster
                    Toast.makeText(MainActivity.this, "Giriş başarılı!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

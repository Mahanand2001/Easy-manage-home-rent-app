package com.example.easymanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.window.SplashScreen;

public class ChooseActivity extends AppCompatActivity {
    private Button adminBtn , userBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        adminBtn = findViewById(R.id.adminbtn);
        userBtn = findViewById(R.id.userbtn);


        adminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseActivity.this, AdminLogin.class);
                startActivity(intent);


            }
        });

        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseActivity.this, UserLogin.class);
                startActivity(intent);
            }
        });



    }
}
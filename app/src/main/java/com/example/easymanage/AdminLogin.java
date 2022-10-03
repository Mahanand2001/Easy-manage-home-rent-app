package com.example.easymanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AdminLogin extends AppCompatActivity {
    private TextInputEditText username, password;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        loginbtn = findViewById(R.id.LoginBtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminLogin.this,AdminMainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"this is admin main activity",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
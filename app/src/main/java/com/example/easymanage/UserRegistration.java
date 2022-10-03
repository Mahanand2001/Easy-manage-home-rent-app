package com.example.easymanage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class UserRegistration extends AppCompatActivity {
    private TextInputEditText fullname, mobile, email, username, password;
    private Button loginpagebtn, registerbtn;
    private ImageView image;
    private TextView textview, textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        image = findViewById(R.id.Image_view);
        textview = findViewById(R.id.text_view);
        textview2 = findViewById(R.id.text_view2);


        fullname = findViewById(R.id.Fullname);
        mobile = findViewById(R.id.Mobile);
        email = findViewById(R.id.Email);
        username = findViewById(R.id.Username2);
        password = findViewById(R.id.Password2);
        loginpagebtn = findViewById(R.id.LoginpageBtn);
        registerbtn = findViewById(R.id.RegisterBtn);


        loginpagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserRegistration.this, UserLogin.class);

                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View, String>(image, "app_logo");
                pairs[1] = new Pair<View, String>(textview, "greeting");
                pairs[2] = new Pair<View, String>(textview2, "slogantext");
                pairs[3] = new Pair<View, String>(fullname, "username");
                pairs[4] = new Pair<View, String>(password, "password");
                pairs[5] = new Pair<View, String>(loginpagebtn, "callbtn");
                pairs[6] = new Pair<View, String>(registerbtn, "loginbtn");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(UserRegistration.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });


    }
}
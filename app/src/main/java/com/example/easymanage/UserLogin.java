package com.example.easymanage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class UserLogin extends AppCompatActivity {
    private TextInputEditText userName, passWord;
    private TextView Greeting, textView;
    private ImageView image;
    private LinearLayout linearLayout;
    private Button loginBtn, registrationpagebtn, forgotbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        userName = findViewById(R.id.Username1);
        image = findViewById(R.id.imageView);
        Greeting = findViewById(R.id.text_view);
        passWord = findViewById(R.id.Password1);
        loginBtn = findViewById(R.id.LoginBtn1);
        textView = findViewById(R.id.text_view2);
        registrationpagebtn = findViewById(R.id.RegistrationpageBtn);
        forgotbtn = findViewById(R.id.ForgotBtn);
        linearLayout = findViewById(R.id.linearlayout);





        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLogin.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"this is main activity", Toast.LENGTH_SHORT).show();
            }
        });



        registrationpagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLogin.this, UserRegistration.class);

                Pair[] pairs = new Pair[7];


                pairs[0] = new Pair<View, String>(image, "app_logo");
                pairs[1] = new Pair<View, String>(Greeting, "greeting");
                pairs[2] = new Pair<View, String>(textView, "slogantext");
                pairs[3] = new Pair<View, String>(userName, "username");
                pairs[4] = new Pair<View, String>(passWord, "password");
                pairs[5] = new Pair<View, String>(linearLayout, "callbtn");
                pairs[6] = new Pair<View, String>(loginBtn, "loginbtn");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(UserLogin.this, pairs);

                startActivity(intent,options.toBundle() );
            }
        });

    }
}
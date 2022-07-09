package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginUserData extends AppCompatActivity {

    TextView name, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user_data);
        name = findViewById(R.id.name);
        pass = findViewById(R.id.password);
        Intent i  = getIntent();

        String username = i.getStringExtra("username");
        String password = i.getStringExtra("password");
        name.setText(username);
        pass.setText(password);
    }
}
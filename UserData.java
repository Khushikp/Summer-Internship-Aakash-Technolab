package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.email);
        TextView mobile = findViewById(R.id.mobile);
        TextView password = findViewById(R.id.password);
        TextView gender = findViewById(R.id.gender);
        TextView hobbies = findViewById(R.id.hobbies);
        Intent in = getIntent();

        String nm = in.getStringExtra("Name");
        name.setText("" + nm);

        String em = in.getStringExtra("Email");
        email.setText("" + em);

        String mo = in.getStringExtra("Mobile");
        mobile.setText("" + mo);

        String pass = in.getStringExtra("Password");
        password.setText("" + pass);

        String gen = in.getStringExtra("Gender");
        gender.setText("" + gen);

        String hob = in.getStringExtra("Hobbies");
        hobbies.setText("" + hob);
    }
}
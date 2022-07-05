package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText name = findViewById(R.id.user_name);
        EditText email = findViewById(R.id.user_email);
        EditText mobile = findViewById(R.id.user_mobile);
        EditText password = findViewById(R.id.user_password);
        RadioButton male = findViewById(R.id.male);
        RadioButton female = findViewById(R.id.female);
        CheckBox art = findViewById(R.id.art);
        CheckBox music = findViewById(R.id.music);
        CheckBox books = findViewById(R.id.books);
        CheckBox travel = findViewById(R.id.travel);

        Button signin = findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nm = name.getText().toString();
                String em = email.getText().toString();
                String mo = mobile.getText().toString();
                String pass = password.getText().toString();
                String hobbies = " ";
                String gender = " ";

                if(art.isChecked())
                {
                    hobbies += "Art ";
                }
                if(music.isChecked())
                {
                    hobbies += "Listening Music ";

                }if(travel.isChecked())
                {
                    hobbies += "Travelling ";
                }if(books.isChecked())
                {
                    hobbies += "Reading Books ";
                }

                if(male.isChecked())
                {
                    gender += "Male ";
                }
                if(female.isChecked())
                {
                    gender += "Female ";

                }
                Intent in = new Intent(registration.this , UserData.class);

                in.putExtra("Name", nm);
                in.putExtra("Email", em);
                in.putExtra("Mobile", mo);
                in.putExtra("Password", pass);
                in.putExtra("Gender", gender);
                in.putExtra("Hobbies", hobbies);

                startActivity(in);

            }
        });
    }
}
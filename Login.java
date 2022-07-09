package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login_btn;
    EditText user_email;
    EditText user_password;
    String user = "khushi@gmail.com";
    String pass = "khushi64";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

                login_btn = findViewById(R.id.login_btn);
                user_email = findViewById(R.id.user_email);
                user_password = findViewById(R.id.user_password);


                login_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (TextUtils.isEmpty(user_email.getText().toString())) {
                            TextUtils.isEmpty(user_password.getText().toString());
                            Toast.makeText(Login.this, "Please enter username and Password ", Toast.LENGTH_SHORT).show();

                        }
                        else if(user_email.getText().toString().equals(user)) {
                            if( user_password.getText().toString().equals(pass))
                            {
                                //Toast.makeText(AuthenticationActivity.this, "Sucessfful Login", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(Login.this,LoginUserData.class );
                                i.putExtra("username", user);
                                i.putExtra("password",pass);
                                startActivity(i);
                            }
                            else{

                                Toast.makeText(Login.this, "Invalid username or Password",Toast.LENGTH_SHORT).show();

                                Intent i = new Intent(Login.this,LoginUserData.class );
                                i.putExtra("username", user);
                                startActivity(i);

                            }

                        }
                        else{
                            Toast.makeText(Login.this, "Invalid username or Password",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
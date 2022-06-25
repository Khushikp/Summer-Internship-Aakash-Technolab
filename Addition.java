package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Addition extends AppCompatActivity {

    EditText a, b;
    TextView zero;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        add = findViewById(R.id.add);
        zero = findViewById(R.id.zero);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1, n2;
                n1 = a.getText().toString();
                n2 = b.getText().toString();

                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                int sum = num1 + num2;

                zero.setText("" + sum);
            }
        });
    }
}
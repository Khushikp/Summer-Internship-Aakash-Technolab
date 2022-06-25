package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonExample extends AppCompatActivity {

    RadioButton pz, pjb, si, it, cn;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_example);

        pjb = findViewById(R.id.pjb);
        pz = findViewById(R.id.pz);
        cn = findViewById(R.id.cn);
        it = findViewById(R.id.it);
        si = findViewById(R.id.si);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String res = "My Favourite Food is ";

                if(pjb.isChecked()){
                    res += "Panjabi";
                }

                if(cn.isChecked()){
                    res += "Chinese";
                }

                if(si.isChecked()){
                    res += "South Indian";
                }

                if(it.isChecked()){
                    res += "Italian";
                }

                if(pz.isChecked()){
                    res += "Pizza";
                }
                Toast.makeText(RadioButtonExample.this, res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
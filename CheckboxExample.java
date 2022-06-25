package com.example.internshiptutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxExample extends AppCompatActivity {

    CheckBox yjhd, znmd, idts, pk, omg, ws;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_example);

        yjhd = findViewById(R.id.yjhd);
        znmd = findViewById(R.id.znmd);
        pk = findViewById(R.id.pk);
        ws = findViewById(R.id.ws);
        idts = findViewById(R.id.idts);
        omg = findViewById(R.id.omg);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = "My Favourite Movie is ";

                if(yjhd.isChecked())
                {
                    res += "\nYJHD";
                }
                if(znmd.isChecked())
                {
                    res += "\nZNMD";
                }if(pk.isChecked())
                {
                    res += "\nPK";
                }if(ws.isChecked())
                {
                    res += "\nWake Up Sid";
                }if(idts.isChecked())
                {
                    res += "\n3 Idiots";
                }if(omg.isChecked())
                {
                    res += "\nOMG";
                }
                Toast.makeText(CheckboxExample.this, res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        final TextView t1 = (TextView) findViewById(R.id.result);
        Button osszead = findViewById(R.id.sum);
        Button kivon = findViewById(R.id.sub);
        Button oszt = findViewById(R.id.div);
        Button szoroz = findViewById(R.id.mul);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        final int num1 = Integer.parseInt(s1);
        final int num2 = Integer.parseInt(s2);

        osszead.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int osszeg=num1+num2;
                t1.setText(Integer.toString(osszeg));
            }
        });
        kivon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int kulonbseg=num1-num2;
                t1.setText(Integer.toString(kulonbseg));
            }
        });
        oszt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int hanyados=num1/num2;
                t1.setText(Integer.toString(hanyados));
            }
        });
        szoroz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int szorzat=num1*num2;
                t1.setText(Integer.toString(szorzat));
            }
        });
    }
}
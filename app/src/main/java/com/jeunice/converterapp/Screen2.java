package com.jeunice.converterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2 extends AppCompatActivity {
    final double INCH_TO_MM = 25.4;

    private EditText txtIn;
    private TextView tvMM;
    private Button btnConvert;
    private  Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        txtIn = (EditText) findViewById(R.id.editTextTextPersonName2);
        tvMM = (TextView) findViewById(R.id.textView6);

        btnConvert = (Button) findViewById(R.id.button2);
        btnQuit = (Button) findViewById(R.id.button3);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertINToMM();
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void convertINToMM(){
        double in = Double.parseDouble( txtIn.getText().toString());
        double mm =  in * INCH_TO_MM;
        tvMM.setText("" + mm+ "");
    }
}

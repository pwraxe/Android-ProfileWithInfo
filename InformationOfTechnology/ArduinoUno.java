package com.example.akshay.informationoftechnology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArduinoUno extends AppCompatActivity
{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arduino_uno);
        button = findViewById(R.id.ButtonInArduino);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastPage();
            }
        });
    }
    public void lastPage()
    {
        Intent i = new Intent(this,EndPage.class);
        startActivity(i);
    }
}

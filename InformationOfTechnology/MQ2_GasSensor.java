package com.example.akshay.informationoftechnology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MQ2_GasSensor extends AppCompatActivity
{
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mq2__gas_sensor);

        btn = findViewById(R.id.ButtonInMQ2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArduinoPage();
            }
        });
    }
    public void ArduinoPage()
    {
        Intent in = new Intent(this,ArduinoUno.class);
        startActivity(in);
    }
}

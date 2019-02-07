package com.example.akshay.informationoftechnology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Android_Information extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android__information);

        button = findViewById(R.id.ButtonInAndroid);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mq2Page();
            }
        });
    }
    public void mq2Page()
    {
        Intent i = new Intent(this,MQ2_GasSensor.class);
        startActivity(i);
    }
}

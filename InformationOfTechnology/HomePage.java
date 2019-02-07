package com.example.akshay.informationoftechnology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    private Button btn,Hire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btn = findViewById(R.id.Home2nxtPageBtn);
        Hire = findViewById(R.id.hireCandiBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAndInfo();
            }
        });

        Hire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTost();
            }
        });
    }
    public void openAndInfo()
    {
        Intent i = new Intent(this,Android_Information.class);
        startActivity(i);
    }
    public  void showTost()
    {
        Toast.makeText(getApplicationContext(),"Candidate Selected",Toast.LENGTH_LONG).show();
    }

}

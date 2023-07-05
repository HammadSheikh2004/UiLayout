package com.example.uilayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView home,services,setting,calender,language,message,call,wifi,laptop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.home);
        services = findViewById(R.id.services);
        setting = findViewById(R.id.setting);
        calender = findViewById(R.id.calender);
        language = findViewById(R.id.language);
        message = findViewById(R.id.message);
        call = findViewById(R.id.call);
        wifi = findViewById(R.id.wifi);
        laptop = findViewById(R.id.laptop);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Home = new Intent(MainActivity.this,Home.class);
                startActivity(Home);
            }
        });

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Service = new Intent(MainActivity.this,Services.class);
                startActivity(Service);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Setting = new Intent(MainActivity.this,Setting.class);
                startActivity(Setting);
            }
        });
    }
}
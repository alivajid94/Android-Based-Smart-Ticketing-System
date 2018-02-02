package com.example.lenovo.bmtc_bus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Driver_after_Login extends AppCompatActivity {
Button button8,map2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_after__login);

        button8=(Button)findViewById(R.id.button8);
        map2=(Button)findViewById(R.id.button11);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bdln=new Intent(getApplicationContext(),Bus_Driver_Login.class);

                startActivity(bdln);
            }
        });
        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map2=new Intent(getApplicationContext(),DriverMapsActivity2.class);
                startActivity(map2);
            }
        });
    }
}

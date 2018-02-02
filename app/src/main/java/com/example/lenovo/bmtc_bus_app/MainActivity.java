package com.example.lenovo.bmtc_bus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Driver;

public class MainActivity extends AppCompatActivity {
Button user,Bus_Driver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(Button)findViewById(R.id.button);
        Bus_Driver=(Button)findViewById(R.id.button2);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent i = new Intent(getApplicationContext(), User_Login.class);
                startActivity(i);
            }
        });

        Bus_Driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bdlogin=new Intent(getApplicationContext(),Bus_Driver_Login.class);
                startActivity(bdlogin);

            }
        });
    }
}

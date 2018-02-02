package com.example.lenovo.bmtc_bus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User_after_Login extends AppCompatActivity {
EditText editText3;
Button balance,sinout,map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_after__login);

        editText3=(EditText)findViewById(R.id.editText3);
        balance=(Button)findViewById(R.id.button5);
        sinout=(Button)findViewById(R.id.button9);
        map=(Button)findViewById(R.id.button10);
        sinout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ual=new Intent(getApplicationContext(),User_Login.class);
                startActivity(ual);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map=new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(map);
            }
        });
    }
}

package com.example.lenovo.bmtc_bus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bus_Driver_Login extends AppCompatActivity {
EditText driverid,pass;
Button logi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus__driver__login);

        driverid=(EditText)findViewById(R.id.editText9);
        pass=(EditText)findViewById(R.id.editText10);

        logi=(Button)findViewById(R.id.button7);

        logi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dlog=new Intent(getApplicationContext(),Driver_after_Login.class);
                startActivity(dlog);
            }
        });
    }
}

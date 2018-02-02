package com.example.lenovo.bmtc_bus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User_Login extends AppCompatActivity {
EditText Rfid,Password;

Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__login);

        Rfid=(EditText)findViewById(R.id.editText);
        Password=(EditText)findViewById(R.id.editText2);

        login=(Button)findViewById(R.id.button3);
        signup=(Button)findViewById(R.id.button4);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),User_after_Login.class);
                startActivity(in);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sinp=new Intent(getApplicationContext(),User_Signup.class);
                startActivity(sinp);
            }
        });
    }
}

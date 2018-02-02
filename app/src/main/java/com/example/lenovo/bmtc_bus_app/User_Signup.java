package com.example.lenovo.bmtc_bus_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User_Signup extends AppCompatActivity {
EditText rfid,password,name,email,mobileno;
Button signout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__signup);

        rfid=(EditText)findViewById(R.id.editText4);
        password=(EditText)findViewById(R.id.editText5);
        name=(EditText)findViewById(R.id.editText6);
        email=(EditText)findViewById(R.id.editText7);
        mobileno=(EditText)findViewById(R.id.editText8);

        signout=(Button)findViewById(R.id.button6);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sout=new Intent(getApplicationContext(),User_Login.class);
                startActivity(sout);
            }
        });
    }
}

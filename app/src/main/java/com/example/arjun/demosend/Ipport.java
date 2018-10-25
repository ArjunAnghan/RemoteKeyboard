package com.example.arjun.demosend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ipport extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipport);

    }


    public void send(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}

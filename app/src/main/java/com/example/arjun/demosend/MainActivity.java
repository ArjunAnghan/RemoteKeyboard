package com.example.arjun.demosend;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    EditText editText1;

//    String message="";

    private TextWatcher text=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.e1);

        text=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String s=editText1.getText().toString();
               BackgroundTask b=new BackgroundTask();
               b.execute(s);



            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        editText1.addTextChangedListener(text);



    }

//    public void send(View view)
//    {
////        String message=editText1.getText().toString();
//
//        BackgroundTask b=new BackgroundTask();
//        b.execute(message);
//    }


}


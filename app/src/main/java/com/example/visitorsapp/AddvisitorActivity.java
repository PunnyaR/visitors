package com.example.visitorsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddvisitorActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1,b2;
    String getFn,getLn,getP,getW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addvisitor);

        e1=(EditText) findViewById(R.id.fn);
        e2=(EditText) findViewById(R.id.ln);
        e3=(EditText) findViewById(R.id.pu);
        e4=(EditText) findViewById(R.id.wm);
        b1=(Button) findViewById(R.id.subbut);
        b2=(Button) findViewById(R.id.bm);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFn=e1.getText().toString();
                getLn=e2.getText().toString();
                getP=e3.getText().toString();
                getW=e4.getText().toString();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o2);
            }
        });

    }
}
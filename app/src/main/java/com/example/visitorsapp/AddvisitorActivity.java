package com.example.visitorsapp;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.PixelCopy;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

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
            class JsonObjectrequest {
            }

            @Override
            public void onClick(View v) {
                getFn=e1.getText().toString();
                getLn=e2.getText().toString();
                getP=e3.getText().toString();
                getW=e4.getText().toString();
                if (getFn.isEmpty()||getLn.isEmpty()||getP.isEmpty()||getW.isEmpty())
                    Toast.makeText(getApplicationContext(),)
                else
                    callApi()


                }
                void callApi() throws JSONException {
                String apiUrl="https://log-app-demo-api.onrender.com/addvisitor";
                JSONObject data=new JSONObject();
                try {
                    data.put("firstname",getFn);
                    data.put("lastname",getLn);
                    data.put("purpose",getP);
                    data.put("whomToMeet",getW);

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                JsonObjectRequest=new JsonObjectRequest(
                        Request.Method.POST,
                        apiUrl,
                        data,
                        response -> Toast.makeText(getApplicationContext(),"suuccessfully added",Toast.LENGTH_LONG).show(),
                        error ->  Toast.makeText(getApplicationContext(),"something went wrong",Toast.LENGTH_LONG).show(),
                );
                RequestQueue queue=Volley.newRequestQueue(getApplicationContext());


            }
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
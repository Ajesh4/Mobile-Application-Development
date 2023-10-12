package com.example.sjcet.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mytv1;
    EditText etv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv1=findViewById(R.id.tv1);
        etv1=findViewById(R.id.text);
    }

    public void Click1(View view) {
        String t=etv1.getText().toString();
        mytv1.setText(t);
    }

    public void Click2(View view) {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}

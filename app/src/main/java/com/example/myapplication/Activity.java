package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        Intent intent=getIntent();
        String val=intent.getStringExtra("name");
        TextView textView=(TextView)findViewById(R.id.text2);
        val=textView.getText() + val;
        textView.setText(val);
    }
}
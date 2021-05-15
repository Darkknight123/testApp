package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

    }

    public void playAgain(View view){

    }
    public void homeButton(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
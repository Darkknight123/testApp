package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class playerSetUp extends AppCompatActivity {
  private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_set_up);

        player1=findViewById(R.id.editTextTextPersonName);
        player2=findViewById(R.id.editTextTextPersonName2);
    }

    public void start(View view){

    }
}
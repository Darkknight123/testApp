package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private CheckBox mFriesCheck,mWingsCheck,mChocolateCheck,mCrispsCheck, mYogurtCheck;
    Button btn2;
    private TextView textView;
    private ArrayList<String>mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }
    public void addListenerOnButton(){
        mFriesCheck=findViewById(R.id.checkbox5);
        mWingsCheck=findViewById(R.id.checkbox1);
        mChocolateCheck=findViewById(R.id.checkbox2);
        mCrispsCheck=findViewById(R.id.checkbox3);
        mYogurtCheck=findViewById(R.id.checkbox4);

        textView=findViewById(R.id.textview);
        mResult=new ArrayList<>();
        textView.setEnabled(false);
        btn2 = findViewById(R.id.button2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             StringBuffer result=new StringBuffer();
             result.append("Fries : ").append(mFriesCheck.isChecked());
             result.append("\nWings: ").append(mWingsCheck.isChecked());
             result.append("\nChocolate : ").append(mChocolateCheck.isChecked());
             result.append("\nCrisps : ").append(mCrispsCheck.isChecked());
             result.append("\nYoghurt : ").append(mYogurtCheck.isChecked());

                Toast.makeText(MainActivity.this,result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });



    }





}


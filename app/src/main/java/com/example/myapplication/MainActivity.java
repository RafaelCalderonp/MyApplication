package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nameApp = "Hola que pasa";
        TextView mTextView = findViewById(R.id.TextView);
int num1=5;
int num2=6;
        //mTextView.setText(nameApp);
        mTextView.setText("La suma es: " + (num1+num2) );
    }
}
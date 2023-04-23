package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView name,surName,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name=findViewById(R.id.tv_name);
        surName=findViewById(R.id.tv_surName);
        age=findViewById(R.id.tv_age);


        name.setText(getIntent().getStringExtra("name"));
        surName.setText(getIntent().getStringExtra("surName"));
        age.setText(getIntent().getStringExtra("age"));
    }
}
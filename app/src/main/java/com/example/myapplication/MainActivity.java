package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name, surName, age;
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        surName = findViewById(R.id.et_surName);
        age = findViewById(R.id.et_age);
        btn_next = findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String first_name = ((EditText) findViewById(R.id.et_name)).getText().toString();
                String first_surName = ((EditText) findViewById(R.id.et_surName)).getText().toString();
                String first_age=((EditText) findViewById(R.id.et_age)).getText().toString();
                intent.putExtra("name",first_name);
                intent.putExtra("surName",first_surName);
                intent.putExtra("age",first_age);
                startActivity(intent);
            }
        });


    }
}
package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText etNama;
    Button btnName;

    public final static String MESSAGE_KEY = "com.example.myfirstapp.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendData(View view){
        etNama = findViewById(R.id.etNama);
        btnName = findViewById(R.id.btnName);
        String message = etNama.getText().toString();
        Intent intent = new Intent(FirstActivity.this,SecondActivity.class );
        intent.putExtra(MESSAGE_KEY,message);
        startActivity(intent);
    }
}
package com.example.task31;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startClick(View view) {
        EditText nameEditText = findViewById(R.id.nameEditText);
        Intent anIntent = new Intent(MainActivity.this, quizActivity1.class);
        String names = nameEditText.getText().toString();
        anIntent.putExtra("name", names);
        startActivity(anIntent);
    }
}
package com.example.task31;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quizActivity1 extends AppCompatActivity {
    Integer number;
    String name;
    public void nextClick(View view){
        Intent quiz1Intent = new Intent(quizActivity1.this , quizActivity2.class);
        quiz1Intent.putExtra("name",name);
        quiz1Intent.putExtra("result",number);
        startActivity(quiz1Intent);
    }

    public void oneClick(View view){
        number++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        Button buttonOne = findViewById(R.id.buttonOne);
        Button buttonTwo = findViewById(R.id.buttonTwo);
        Button buttonThree = findViewById(R.id.buttonThree);
        TextView nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText("Welcome " + name + "!");


        buttonOne.setOnTouchListener(new View.OnTouchListener() {
          @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_BUTTON_PRESS:
                        buttonOne.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonOne.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                }
                return true;
            }
        });
        buttonTwo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonOne.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonOne.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
        buttonThree.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonOne.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonOne.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });

    }

}
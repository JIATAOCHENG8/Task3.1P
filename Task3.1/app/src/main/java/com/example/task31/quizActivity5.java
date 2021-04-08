package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class quizActivity5 extends AppCompatActivity {
    Integer number;

    public void nextClick(View view){
        Intent intent = getIntent();
        String name;
     //   String score;
    //    int number_1;
     //   score = intent.getStringExtra("result");
     //   number_1 = Integer.parseInt(score);
    //    number_1 = number_1 + number;
        name = intent.getStringExtra("name");
        Intent quiz5Intent = new Intent(quizActivity5.this , quizActivityGrade.class);
        quiz5Intent.putExtra("name",name);
        quiz5Intent.putExtra("result",number);
        startActivity(quiz5Intent);
    }

    public void oneClick(View view){
        number++;
        Intent intent = getIntent();
        String score;
        int number_1;
        score = intent.getStringExtra("result");
        number_1 = Integer.parseInt(score);
        number = number_1 + number;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

        Button buttonOrange = findViewById(R.id.buttonOrange);
        Button buttonPeach = findViewById(R.id.buttonPeach);
        Button buttonCup = findViewById(R.id.buttonCup);


        buttonCup.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonCup.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonCup.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                }
                return true;
            }
        });
        buttonOrange.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonOrange.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonOrange.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
        buttonPeach.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonPeach.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonPeach.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
    }
}
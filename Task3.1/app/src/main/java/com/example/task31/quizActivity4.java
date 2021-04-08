package com.example.task31;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class quizActivity4 extends AppCompatActivity {
        Integer number;

    public void nextClick(View view){
        Intent intent = getIntent();
        String name;
    //    String score;
    //    int number_1;
    //    score = intent.getStringExtra("result");
     //   number_1 = Integer.parseInt(score);
     //   number_1 = number_1 + number;
        name = intent.getStringExtra("name");
        Intent quiz4Intent = new Intent(quizActivity4.this, quizActivity5.class);
        quiz4Intent.putExtra("name",name);
        quiz4Intent.putExtra("result",number);
        startActivity(quiz4Intent);
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
        setContentView(R.layout.activity_quiz4);

        Button buttonDog = findViewById(R.id.buttonDog);
        Button buttonApple = findViewById(R.id.buttonApple);
        Button buttonCat = findViewById(R.id.buttonCat);

        buttonApple.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonApple.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonApple.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                }
                return true;
            }
        });
        buttonCat.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonCat.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonCat.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
        buttonDog.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonDog.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonDog.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
    }
}
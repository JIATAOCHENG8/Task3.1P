package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class quizActivity3 extends AppCompatActivity {
    Integer number;

    public void nextClick(View view){
        Intent intent = getIntent();
        String name;
     //   String score;
    //   int number_1;
   //     score = intent.getStringExtra("result");
    //    number_1 = Integer.parseInt(score);
    //    number_1 = number_1 + number;
        name = intent.getStringExtra("name");
        Intent quiz3Intent = new Intent(quizActivity3.this , quizActivity4.class);
        quiz3Intent.putExtra("result",number);
        quiz3Intent.putExtra("name",name);
        startActivity(quiz3Intent);
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
        setContentView(R.layout.activity_quiz3);

        Button buttonD = findViewById(R.id.buttonD);
        Button buttonH = findViewById(R.id.buttonH);
        Button buttonC = findViewById(R.id.buttonC);



        buttonD.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonD.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonD.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                }
                return true;
            }
        });
        buttonC.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonC.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonC.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
        buttonH.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonH.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonH.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });


    }
}
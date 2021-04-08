package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class quizActivity2 extends AppCompatActivity {
    Integer number;

    public void nextClick(View view){
        Intent intent = getIntent();
        String name;
       // String score;
       // int number_1;
       // score = intent.getStringExtra("result");
       // number_1 = Integer.parseInt(score);
      //  number_1 = number_1 + number;
        name = intent.getStringExtra("name");
        Intent quiz2Intent = new Intent(quizActivity2.this , quizActivity3.class);
        quiz2Intent.putExtra("name",name);
        quiz2Intent.putExtra("result",number);
        startActivity(quiz2Intent);
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
        setContentView(R.layout.activity_quiz2);

        Button buttonSIT223 = findViewById(R.id.buttonSIT223);
        Button buttonSIT305 = findViewById(R.id.buttonSIT305);
        Button buttonSIT122 = findViewById(R.id.buttonSIT122);

        buttonSIT305.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonSIT305.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonSIT305.setBackgroundColor(Color.rgb(0, 200, 0));
                        break;
                }
                return true;
            }
        });
        buttonSIT122.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonSIT122.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonSIT122.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });
        buttonSIT223.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        buttonSIT223.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                    case MotionEvent.ACTION_UP:
                        buttonSIT223.setBackgroundColor(Color.rgb(200, 0, 0));
                        break;
                }
                return true;
            }
        });

    }
}
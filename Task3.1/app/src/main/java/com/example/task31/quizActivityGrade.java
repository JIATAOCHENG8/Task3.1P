package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quizActivityGrade extends AppCompatActivity {

    public void newQuizClick(View view){
        Intent intent = new Intent(quizActivityGrade.this , MainActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_grade);
        Intent intent = getIntent();

        TextView gradeTextView = findViewById(R.id.gradeTextView);
        String name = intent.getStringExtra("name");
        gradeTextView.setText("Congratulation "+ name + "!");

        TextView scoreTextView = findViewById(R.id.scoreTextView);
        String score = intent.getStringExtra("result");
        scoreTextView.setText(score +"/5");

        Button buttonFinish = findViewById(R.id.buttonFinish);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });



    }
}
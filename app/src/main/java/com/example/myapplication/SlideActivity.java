package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SlideActivity extends AppCompatActivity {

    private ImageView mIvHead;
    private SlideMenu slideMenu;

    private Button buttonStudy;
    private Button buttonPlay;
    private Button buttonExercise;
    private Button buttonRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);


        mIvHead = findViewById(R.id.iv_head);
        slideMenu = findViewById(R.id.slideMenu);
        buttonStudy = findViewById(R.id.btn_1);
        buttonPlay = findViewById(R.id.btn_2);
        buttonExercise = findViewById(R.id.btn_3);
        buttonRead = findViewById(R.id.btn_4);

        mIvHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideMenu.switchMenu();
            }
        });
        setListener();
    }

    private void setListener() {
        Onclick onclick = new Onclick();
        buttonStudy.setOnClickListener(onclick);
        buttonPlay.setOnClickListener(onclick);
        buttonExercise.setOnClickListener(onclick);
        buttonRead.setOnClickListener(onclick);
    }

    private class Onclick implements  View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_1:
                    intent = new Intent(SlideActivity.this, StudyActivity.class);
                    break;
                case R.id.btn_2:
                    intent = new Intent(SlideActivity.this, PlayActivity.class);
                    break;
                case R.id.btn_3:
                    intent = new Intent(SlideActivity.this, ExerciseActivity.class);
                    break;
                case R.id.btn_4:
                    intent = new Intent(SlideActivity.this, ReadActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
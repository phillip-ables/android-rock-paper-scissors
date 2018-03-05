package com.example.techtron.sexherpieshand;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_sex, btn_herpies, btn_hand;
    ImageView iv_cpu, iv_me;

    String myChoice, cpuChoice;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_me = (ImageView) findViewById(R.id.iv_me);

        btn_sex = (Button) findViewById(R.id.btn_sex);
        btn_herpies = (Button) findViewById(R.id.btn_herpies);
        btn_hand = (Button) findViewById(R.id.btn_hand);

        r = new Random();

        btn_sex.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myChoice = "sex";
                calculate();
            }
        });
        btn_herpies.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myChoice = "herpies";
                calculate();
            }
        });
        btn_hand.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myChoice = "hand";
                calculate();
            }
        })
    }
    public void calculate() {

    }
}

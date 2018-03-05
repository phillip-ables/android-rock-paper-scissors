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
                iv_me.setImageResource(R.drawable.sex);
                calculate();
            }
        });
        btn_herpies.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myChoice = "herpies";
                iv_me.setImageResource(R.drawable.herpies);
                calculate();
            }
        });
        btn_hand.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myChoice = "hand";
                iv_me.setImageResource(R.drawable.hand);
                calculate();
            }
        });
    }
    public void calculate() {
        int cpu = r.nextInt(3);
        if(cpu == 0){
            cpuChoice = "sex";
            iv_cpu.setImageResource(R.drawable.sex);
        }else if(cpu == 1){
            cpuChoice = "herpies";
            iv_cpu.setImageResource(R.drawable.herpies);
        }else if(cpu == 2){
            cpuChoice = "hand";
            iv_cpu.setImageResource(R.drawable.hand);
        }
    }
}

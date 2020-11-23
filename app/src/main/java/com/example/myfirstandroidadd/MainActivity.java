package com.example.myfirstandroidadd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer soundA;
    MediaPlayer soundB;
    MediaPlayer soundC;
    MediaPlayer soundD;

    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundA =  MediaPlayer.create(this, R.raw.sonido_1);
        soundB =  MediaPlayer.create(this, R.raw.sonido_2);
        soundC =  MediaPlayer.create(this, R.raw.sonido_3);
        soundD =  MediaPlayer.create(this, R.raw.sonido_4);

    boton1 = (Button)findViewById(R.id.button);
    boton2 = (Button)findViewById(R.id.button2);
    boton3 = (Button)findViewById(R.id.button4);
    boton4 = (Button)findViewById(R.id.button5);

    boton1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boton1.setBackgroundColor(Color.parseColor("#32E323"));
            soundA.start();


        }
    });

    boton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boton2.setBackgroundColor(Color.parseColor("#FF5733"));
            soundB.start();
        }
    });

    boton3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boton3.setBackgroundColor(Color.parseColor("#FFC300"));
            soundC.start();
        }
    });

    boton4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boton4.setBackgroundColor(Color.parseColor("#3498DB"));
            soundD.start();
        }
    });

    }

}
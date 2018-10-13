package com.londonappbrewery.magiceightball;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        final MediaPlayer mp;


        ballDisplay = (ImageView) findViewById(R.id.displayBall);

        final int[] ballArray = {

                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,

        };

        Button myButton;

        myButton = (Button) findViewById(R.id.askButton);
        mp = MediaPlayer.create(getApplicationContext(),R.raw.bubblesound);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Random randomNumber = new Random();

                int number = randomNumber.nextInt(4);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });




    }
}
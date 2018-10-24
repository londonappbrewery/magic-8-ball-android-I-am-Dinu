package com.londonappbrewery.magiceightball;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView displayimg = findViewById(R.id.displayimg);
        Button askButton = findViewById(R.id.ask);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sparklingeffect);


        final int allImg[] = {

                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5

        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Random rg = new Random();

                int frg = rg.nextInt(5);

                displayimg.setImageResource(allImg[frg]);

            }
        });

    }
}
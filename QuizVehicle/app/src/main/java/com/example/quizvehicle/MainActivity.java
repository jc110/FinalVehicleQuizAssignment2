package com.example.quizvehicle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageButton play,settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Variable assigned to widget which uniquelly identified by ID

        MediaPlayer sound = MediaPlayer.create(this,R.raw.creativeminds);
        play=findViewById(R.id.Play1);
        settings=findViewById(R.id.Settings1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
                sound.start();
            }
        });
        // Method to implement when settings button clicked
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

    }
    // Defining Activity
    public void openActivity2(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);


    }
    public void  openActivity3(){
        Intent intent2=new Intent(this,MainActivity3.class);
        startActivity(intent2);
    }
}
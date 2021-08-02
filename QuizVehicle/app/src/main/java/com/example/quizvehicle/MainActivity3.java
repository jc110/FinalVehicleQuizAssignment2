package com.example.quizvehicle;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    private SeekBar seekBar;
    private AudioManager audioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        seekBar =(SeekBar)findViewById(R.id.seekBar);
        audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        seekBar.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        seekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
    }

    public void UpButton(View view){
        audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
        seekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
        Toast.makeText(this,"Volume Up", Toast.LENGTH_SHORT).show();
    }

    public void DownButton(View view){
        audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
        seekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
        Toast.makeText(this,"Volume Down", Toast.LENGTH_SHORT).show();
    }
    }

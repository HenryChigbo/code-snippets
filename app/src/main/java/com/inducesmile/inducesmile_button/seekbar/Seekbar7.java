package com.inducesmile.inducesmile_button.seekbar;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.inducesmile.inducesmile_button.R;

public class Seekbar7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar7);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setProgress(50);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            seekBar.setMin(25);
        }
        seekBar.setMax(40);
    }
}

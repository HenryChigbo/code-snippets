package com.inducesmile.inducesmile_button.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

public class Seekbar8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar8);

        TextView seekbarValue = findViewById(R.id.getValue);
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setProgress(35);
        seekbarValue.setText(String.valueOf(seekBar.getProgress()));
    }
}

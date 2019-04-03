package com.inducesmile.inducesmile_button.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import com.inducesmile.inducesmile_button.R;

public class Seekbar10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar10);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        SeekBar seekBar = new SeekBar(this);
        linearLayout.addView(seekBar);
    }
}

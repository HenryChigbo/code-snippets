package com.inducesmile.inducesmile_button.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

public class Seekbar4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar4);

        SeekBar seekBar = findViewById(R.id.seekBar);
        final TextView textView = findViewById(R.id.textview);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Seekbar Changing");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textView.setTextSize(25);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText("Text Changed");
                textView.setTextColor(getResources().getColor(R.color.colorAccent));

            }
        });
    }
}

package com.inducesmile.inducesmile_button.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

public class Seekbar18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar18);

        TextView seekbarValue = findViewById(R.id.getValue);
        RatingBar ratingBar = findViewById(R.id.ratingBar4);
        ratingBar.setProgress(3);
        seekbarValue.setText(String.valueOf(ratingBar.getProgress()));
    }
}

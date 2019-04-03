package com.inducesmile.inducesmile_button.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import com.inducesmile.inducesmile_button.R;

public class Seekbar17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar17);

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(2.0f);
    }
}

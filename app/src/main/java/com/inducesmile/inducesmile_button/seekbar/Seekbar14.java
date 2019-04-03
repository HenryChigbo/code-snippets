package com.inducesmile.inducesmile_button.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RatingBar;

import com.inducesmile.inducesmile_button.R;

public class Seekbar14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar14);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        RatingBar ratingBar = new RatingBar(this);
        linearLayout.addView(ratingBar);
    }
}

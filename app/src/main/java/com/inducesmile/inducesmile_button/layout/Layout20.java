package com.inducesmile.inducesmile_button.layout;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class Layout20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout20);

        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.notebook);

        constraintLayout.addView(imageView, 0);
    }
}

package com.inducesmile.inducesmile_button.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class Animation4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation4);

        Button start = findViewById(R.id.start);
        Button stop = findViewById(R.id.stop);
        final ImageView imageView = findViewById(R.id.image);
        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animation);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.clearAnimation();
                animation.cancel();
            }
        });
    }
}

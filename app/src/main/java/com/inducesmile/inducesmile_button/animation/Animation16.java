package com.inducesmile.inducesmile_button.animation;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class Animation16 extends AppCompatActivity {

    AnimationDrawable animationDrawable;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation16);

        final ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(R.drawable.drawable_animation);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable = (AnimationDrawable) imageView.getDrawable();
                animationDrawable.stop();
                animationDrawable.selectDrawable(0);
                animationDrawable.start();
            }
        });
    }
}

package com.inducesmile.inducesmile_button.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class Animation20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation20);

        ImageView imageView = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        imageView.startAnimation(animation);
    }
}
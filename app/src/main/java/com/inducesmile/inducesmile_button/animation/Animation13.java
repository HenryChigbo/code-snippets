package com.inducesmile.inducesmile_button.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class Animation13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation13);

        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        final Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        final ImageView imageView = findViewById(R.id.image);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(getApplicationContext(), "First animation running", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "First Animation has end, starting second animation now", Toast.LENGTH_LONG).show();
                imageView.startAnimation(animation2);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animation);
            }
        });
    }
}

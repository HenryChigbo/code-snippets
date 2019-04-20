package com.inducesmile.inducesmile_button.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class Animation17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation17);

        final ImageView imageView = findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateIntent(imageView);
            }
        });
    }

    public void animateIntent(View view) {

        Intent intent = new Intent(this, Animation1.class);

        // Get the transition name from the string
        String transitionName = getString(R.string.transition_string);
        ImageView imageView = findViewById(R.id.image);

        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                        imageView,   // Starting view
                        transitionName    // The String
                );
        ActivityCompat.startActivity(this, intent, options.toBundle());

    }
}

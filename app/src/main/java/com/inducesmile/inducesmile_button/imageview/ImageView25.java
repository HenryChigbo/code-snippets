package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.inducesmile.inducesmile_button.R;

public class ImageView25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_image_view);

        ImageView imageView = findViewById(R.id.imageView2);

        //Load a gif image
        int imageUrl = R.drawable.gifimage;

        Glide.with(this)
                .load(imageUrl)
                .into(imageView);
    }
}

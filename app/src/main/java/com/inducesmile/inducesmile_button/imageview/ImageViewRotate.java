package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;
import com.squareup.picasso.Picasso;

public class ImageViewRotate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_rotate);

        ImageView imageView = findViewById(R.id.imageView2);

        //Image Resource to load
        int imageDrawable = R.drawable.ext;

        //Loading image using Picasso
        Picasso.get()
                .load(imageDrawable)
                .rotate(90.5f)
                .into(imageView);
    }
}

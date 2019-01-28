package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;
import com.squareup.picasso.Picasso;

public class ImageViewUrl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_url);

        String imageUrl = "https://www.gravatar.com/avatar/859adc3b1a6cfb0013c00a7b783cd557?s=48&d=identicon&r=PG&f=1";
        ImageView imageView = findViewById(R.id.imageView2);

        //Loading image using Picasso
        Picasso.get()
                .load(imageUrl)
                .into(imageView);
    }
}

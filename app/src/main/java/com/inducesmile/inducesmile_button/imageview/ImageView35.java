package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;
import com.squareup.picasso.Picasso;

public class ImageView35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_picasso);

        ImageView imageView = findViewById(R.id.imageView2);

        //Image Resource to load
        int imageDrawable = R.drawable.ext;

        //Loading image using Picasso
        Picasso.get()
                .load(imageDrawable)
                .into(imageView);

        Toast.makeText(this, "Image load using Picassso", Toast.LENGTH_SHORT).show();

    }
}

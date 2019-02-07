package com.inducesmile.inducesmile_button.imageview;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;
import com.squareup.picasso.Picasso;

public class ImageView6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_image_view);

        final ImageView imageView = findViewById(R.id.imageView2);
        final ImageView bitmapImageView = findViewById(R.id.bitmapImageView);

        Button button = findViewById(R.id.bitmapToImageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitmapImageView.setImageBitmap(imageView2Bitmap(imageView));
            }
        });

        //Loading image using Picasso and resize the ImageView
        Picasso.get()
                .load()
                .resize(225, 145)
                .into(imageView);
    }

    private Bitmap imageView2Bitmap(ImageView view){
        Bitmap bitmap = ((BitmapDrawable)view.getDrawable()).getBitmap();
        return bitmap;
    }
}

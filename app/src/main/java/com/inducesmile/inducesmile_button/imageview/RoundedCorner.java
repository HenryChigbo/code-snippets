package com.inducesmile.inducesmile_button.imageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class RoundedCorner extends AppCompatActivity {

    ImageView imageView = findViewById(R.id.imageView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_corner);

        Bitmap batmapBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ext);
        RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), batmapBitmap);

        circularBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(circularBitmapDrawable);

    }

}

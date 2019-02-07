package com.inducesmile.inducesmile_button.imageview;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class ImageView36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_drawable_image_view);

        ColorDrawable colorDrawable = new ColorDrawable(0xffff0000);
        colorDrawable.setAlpha(255);

        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageDrawable(colorDrawable);
    }
}

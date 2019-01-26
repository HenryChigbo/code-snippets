package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class ScaleImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_image);

        ImageView imageView= findViewById(R.id.imageView3);
        //This sets the ScaleType to FitXY programmatically
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}

package com.inducesmile.inducesmile_button.imageview;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ZoomInZoomOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_in_zoom_out);

        ImageView view = findViewById(R.id.imageView2);

        PhotoViewAttacher pAttacher;
        pAttacher = new PhotoViewAttacher(view);
        pAttacher.update();

    }
}

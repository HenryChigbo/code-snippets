package com.inducesmile.inducesmile_button.imageview;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ImageView32 extends AppCompatActivity {

    GestureDetectorCompat mGestureDetector;
    ImageView imageView = findViewById(R.id.imageView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_touch_event);

        mGestureDetector = new GestureDetectorCompat(this, new GestureListener());

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mGestureDetector.onTouchEvent(event);
                return ImageView32.super.onTouchEvent(event);
            }
        });
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Toast.makeText(getApplicationContext(), "onSingleTapConfirmed", Toast.LENGTH_SHORT).show();
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Toast.makeText(getApplicationContext(), "onDoubleTap", Toast.LENGTH_SHORT).show();
            return super.onDoubleTap(e);
        }
    }
}

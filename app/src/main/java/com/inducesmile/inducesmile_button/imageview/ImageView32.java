package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ImageView32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_touch_event);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getActionMasked();
                Toast.makeText(getApplicationContext(), "The event is " + String.valueOf(action), Toast.LENGTH_SHORT).show();
                return ImageView32.super.onTouchEvent(event);
            }
        });


    }



}

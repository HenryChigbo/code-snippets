package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ImageView33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_and_show_image);

        final ImageView imageView = findViewById(R.id.imageView2);
        Button hideImage = findViewById(R.id.hideImage);
        Button showImage = findViewById(R.id.showImage);

        hideImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "The image is not visible", Toast.LENGTH_SHORT).show();
                imageView.setVisibility(View.INVISIBLE);
            }
        });

        showImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "The image is visible", Toast.LENGTH_SHORT).show();
                imageView.setVisibility(View.VISIBLE);
            }
        });
    }

}

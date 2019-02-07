package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ImageView21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image);

        final ImageView imageView = findViewById(R.id.imageView2);
        Button changeImage = findViewById(R.id.changeImage);

        changeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.ext);
                Toast.makeText(getApplicationContext(), "Clicking the button change the image", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

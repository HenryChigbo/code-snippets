package com.inducesmile.inducesmile_button.imageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ImageView5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable2_bitmap);

        final ImageView imageView = findViewById(R.id.imageView2);
        Button drawable2Bitmap = findViewById(R.id.convertToBitmap);

        drawable2Bitmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ext);
                imageView.setImageBitmap(bitmap);
                Toast.makeText(getApplicationContext(), "Image converted to Bitmap", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

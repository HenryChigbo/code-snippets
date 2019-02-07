package com.inducesmile.inducesmile_button.imageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.inducesmile.inducesmile_button.R;

public class ImageView24 extends AppCompatActivity {

    String base64String = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIAAAACACAYAAADDPmHLAA...";
    String base64Image = base64String.split(",")[1];
    byte[] decodedString = Base64.decode(base64Image, Base64.DEFAULT);
    Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base64_to_bitmap);

        ImageView imageView = findViewById(R.id.imageView2);
        //imageView.setImageBitmap(decodedByte);

        Glide.with(this)
                .load(decodedByte)
                .into(imageView);
    }
}

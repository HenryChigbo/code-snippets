package com.inducesmile.inducesmile_button.imageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

import java.io.ByteArrayOutputStream;

public class Drawable2ByteArray extends AppCompatActivity {

    Bitmap bitmap1, bitmap2;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] BYTES;
    Drawable drawable;
    ImageView imageView = findViewById(R.id.imageView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable2_byte_array);

        Button button = findViewById(R.id.drawable2ByteArray);

        byteArrayOutputStream = new ByteArrayOutputStream();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawable = getResources().getDrawable(R.drawable.ext);
                bitmap1 = ((BitmapDrawable) drawable).getBitmap();
                bitmap1.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                BYTES = byteArrayOutputStream.toByteArray();
                bitmap2 = BitmapFactory.decodeByteArray(BYTES, 0, BYTES.length);
                imageView.setImageBitmap(bitmap2);

            }
        });
    }
}

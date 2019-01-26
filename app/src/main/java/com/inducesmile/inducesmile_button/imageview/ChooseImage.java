package com.inducesmile.inducesmile_button.imageview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

import java.io.FileNotFoundException;

public class ChooseImage extends AppCompatActivity {

    private ImageView imageView = findViewById(R.id.imageView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_image);

        Button selectImage = findViewById(R.id.uploadImage);


        selectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent choosePicture = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(choosePicture, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == RESULT_OK){
            Uri imageUri = intent.getData();
            Display currentDisplay = getWindowManager().getDefaultDisplay();
            int dw = currentDisplay.getWidth();
            int dh = currentDisplay.getHeight() / 2 - 100;
            try {
                BitmapFactory.Options bitmapFactoryOptions = new BitmapFactory.Options();
                bitmapFactoryOptions.inJustDecodeBounds = true;
                Bitmap bitmap; //= BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri), null, bitmapFactoryOptions);
                bitmapFactoryOptions.inSampleSize = 2;
                bitmapFactoryOptions.inJustDecodeBounds = false;
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri), null, bitmapFactoryOptions);
                imageView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e){
                Log.e("Error", e.toString());
            }
        }

    }
}

package com.inducesmile.inducesmile_button.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.inducesmile.inducesmile_button.R;

public class ImageViewFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_fragment);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new ImageFragment()).commit();
    }

}

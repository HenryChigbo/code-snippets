package com.inducesmile.inducesmile_button.imageview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.inducesmile.inducesmile_button.R;

public class ImageView1 extends AppCompatActivity {

    ImageView1Helper imageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_fragment);

        imageFragment = new ImageView1Helper();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, imageFragment);
        fragmentTransaction.commit();
    }

}

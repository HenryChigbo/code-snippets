package com.inducesmile.inducesmile_button.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.inducesmile.inducesmile_button.R;

public class Animation5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation5);

    }

    public void slide(View view) {
        Intent intent = new Intent(this, Animation1.class);
        startActivityForResult(intent, 500);
        overridePendingTransition(R.anim.slide_left, R.anim.slide_right);
    }
}

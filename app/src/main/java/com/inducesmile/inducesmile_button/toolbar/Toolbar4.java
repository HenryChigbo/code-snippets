package com.inducesmile.inducesmile_button.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.inducesmile.inducesmile_button.R;

public class Toolbar4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar4);

        Toolbar toolbar = findViewById(R.id.toolbar_top);
        toolbar.setTitle("Custom Text Size");
        toolbar.setTitleTextAppearance(this, R.style.CustomText);
    }
}

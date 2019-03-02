package com.inducesmile.inducesmile_button.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.inducesmile.inducesmile_button.R;

public class Toolbar7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar7);

        Toolbar toolbar = findViewById(R.id.toolbar_top);
        toolbar.setTitle("Remove Drop Shadow");
        setSupportActionBar(toolbar);
        getSupportActionBar();
        getSupportActionBar().setElevation(0);
    }
}

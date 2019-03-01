package com.inducesmile.inducesmile_button.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.inducesmile.inducesmile_button.R;

public class Toolbar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar2);

        Toolbar toolbar = findViewById(R.id.toolbar_top);
        toolbar.setTitle("Custom Font");
        toolbar.setTitleTextAppearance(this, R.style.BitterTextAppearance);
    }
}

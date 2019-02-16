package com.inducesmile.inducesmile_button.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.inducesmile.inducesmile_button.R;

public class Layout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);

        LinearLayout linearLayout = findViewById(R.id.linearlayout);
        linearLayout.setPadding(50, 10,50, 10);
    }
}

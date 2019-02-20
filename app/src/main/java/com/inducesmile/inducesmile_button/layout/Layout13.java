package com.inducesmile.inducesmile_button.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.inducesmile.inducesmile_button.R;

public class Layout13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout13);

        LinearLayout layout = findViewById(R.id.linearlayout);
        for(int i=0; i<layout.getChildCount(); i++) {
            ImageView imageView = (ImageView)layout.getChildAt(i);
            imageView.setImageResource(R.drawable.notebook);
        }
    }
}

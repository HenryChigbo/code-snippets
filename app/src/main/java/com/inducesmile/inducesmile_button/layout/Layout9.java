package com.inducesmile.inducesmile_button.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class Layout9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout9);

        LinearLayout linearLayout = findViewById(R.id.linearlayout);
        linearLayout.removeAllViews();

        Toast.makeText(getApplicationContext(), "All views removed", Toast.LENGTH_LONG).show();
    }
}

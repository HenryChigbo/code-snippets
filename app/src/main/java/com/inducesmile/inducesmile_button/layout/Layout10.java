package com.inducesmile.inducesmile_button.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class Layout10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout10);

        LinearLayout linearLayout = findViewById(R.id.linearlayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Linear Layout clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}

package com.inducesmile.inducesmile_button.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.MainActivity;
import com.inducesmile.inducesmile_button.R;

public class Toolbar8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar8);

        Toolbar toolbar = findViewById(R.id.toolbar_top);
        toolbar.setTitle("On Back Arrow Click");
        setSupportActionBar(toolbar);
        getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Toolbar1.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "This will start Toolbar1 Activity", Toast.LENGTH_LONG).show();
            }
        });
    }
}

package com.inducesmile.inducesmile_button.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class RoundedCornerButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_corner_button);

        Button button = findViewById(R.id.button2);

        //Add OnClickEvents to the button that responds to the user event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This is a Round Corner Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

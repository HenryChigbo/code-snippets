package com.inducesmile.inducesmile_button.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ChangeButtonColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_button_color);

        final Button button = findViewById(R.id.button6);

        //Add OnClickEvents to the button that responds to the user event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                Toast.makeText(getBaseContext(), "The Button changed color when pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

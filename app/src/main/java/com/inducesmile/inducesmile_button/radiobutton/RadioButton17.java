package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class RadioButton17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button17);

        final RadioButton radioButton = findViewById(R.id.radioButton1);

        RadioGroup radioGroup = findViewById(R.id.radio);

        Button resetButton = findViewById(R.id.button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "RadioButton Selection cleared", Toast.LENGTH_LONG).show();

                if (radioButton.isChecked()) {
                    radioButton.setChecked(false);
                }
            }
        });
    }
}

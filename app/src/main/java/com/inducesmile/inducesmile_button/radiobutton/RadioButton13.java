package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.inducesmile.inducesmile_button.R;

public class RadioButton13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button13);

        RadioGroup radioGroup = findViewById(R.id.radio);
        ((RadioButton)radioGroup.findViewById(R.id.radioButton1)).setChecked(true);
    }
}
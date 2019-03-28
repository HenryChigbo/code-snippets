package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

import com.inducesmile.inducesmile_button.R;

public class RadioButton1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button1);

        RadioButton radioButton1 = findViewById(R.id.radioButton);
        radioButton1.setTextSize(20);
    }
}

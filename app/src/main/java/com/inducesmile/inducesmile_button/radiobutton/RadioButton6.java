package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

import com.inducesmile.inducesmile_button.R;

public class RadioButton6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button6);

        RadioButton radioButton = findViewById(R.id.radioButton2);
        radioButton.setClickable(false);
    }
}

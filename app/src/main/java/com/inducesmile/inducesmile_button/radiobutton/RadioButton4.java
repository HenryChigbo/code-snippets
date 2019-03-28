package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

import com.inducesmile.inducesmile_button.R;

public class RadioButton4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button4);

        RadioButton radioButton = findViewById(R.id.radioButton2);
        radioButton.setChecked(true);
    }
}

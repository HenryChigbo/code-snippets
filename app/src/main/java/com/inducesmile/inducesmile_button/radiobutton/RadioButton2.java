package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

import com.inducesmile.inducesmile_button.R;

public class RadioButton2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button2);

        RadioButton radioButton1 = findViewById(R.id.radioButton);
        radioButton1.setTextColor(getResources().getColor(R.color.colorAccent));
    }
}

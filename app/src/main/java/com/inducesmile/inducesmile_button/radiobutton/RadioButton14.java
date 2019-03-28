package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.inducesmile.inducesmile_button.R;

public class RadioButton14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button14);

        RadioGroup radioGroup = findViewById(R.id.radio);
        final RadioButton radioButton = findViewById(R.id.radioButton1);
        final RadioButton radioButton1 = findViewById(R.id.radioButton2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton1){
                    radioButton.setTextColor(getResources().getColor(R.color.colorAccent));
                    radioButton1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                }

                if (checkedId == R.id.radioButton2){
                    radioButton.setText("OnCheckedChangeListener");
                }
            }
        });
    }
}

package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class RadioButton12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button12);

        final RadioGroup radioGroup = findViewById(R.id.radio);
        Button getIndex = findViewById(R.id.index);

        getIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedIndex = radioGroup.getCheckedRadioButtonId();
                // If nothing is selected from Radio Group, then it return -1
                if (selectedIndex != -1) {

                    RadioButton selectedRadioButton = findViewById(selectedIndex);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();

                    Toast.makeText(getApplicationContext(), selectedRadioButtonText + " selected", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Nothing was selected", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

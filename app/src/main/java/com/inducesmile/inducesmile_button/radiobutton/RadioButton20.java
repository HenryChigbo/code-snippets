package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class RadioButton20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button20);

        final RadioGroup radioGroup = findViewById(R.id.radiogroup);
        Button button = findViewById(R.id.getCount);

        radioGroup.getChildCount();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radiogroup = radioGroup.getChildCount();
                RadioButton radioButton = findViewById(radiogroup);
                String text = radioButton.getText().toString();
                Toast.makeText(getApplicationContext(), "The total number of " + text, Toast.LENGTH_LONG).show();
            }
        });

    }

}

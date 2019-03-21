package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class CheckBox13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box13);

        final CheckBox checkBox2 = findViewById(R.id.checkBox15);
        final CheckBox checkBox3 = findViewById(R.id.checkBox16);

        Button resetButton = findViewById(R.id.button14);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Checkbox cleared", Toast.LENGTH_SHORT).show();

                if (checkBox2.isChecked()) {
                    checkBox2.setChecked(false);
                }

                if (checkBox3.isChecked()) {
                    checkBox3.setChecked(false);
                }
            }
        });

    }
}

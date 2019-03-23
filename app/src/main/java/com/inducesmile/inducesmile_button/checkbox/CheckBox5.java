package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class CheckBox5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box5);

        final CheckBox checkBox1, checkBox2;
        checkBox1 = findViewById(R.id.checkBox19);
        checkBox2 = findViewById(R.id.checkBox20);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Checkbox 1 selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox2.isChecked()){
                    Toast.makeText(getApplicationContext(), "Checkbox 2 Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

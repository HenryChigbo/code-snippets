package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

import com.inducesmile.inducesmile_button.R;

public class CheckBox19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box19);

        CheckBox checkBox = findViewById(R.id.checkBox12);
        checkBox.setChecked(true);
    }
}
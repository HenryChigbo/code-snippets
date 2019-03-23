package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class CheckBox9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box9);

        CheckBox checkBox = findViewById(R.id.checkBox22);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //This will prevent the Checkbox from changing state
                buttonView.setChecked(false);
                Toast.makeText(getApplicationContext(), "The state cannot be change", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

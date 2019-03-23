package com.inducesmile.inducesmile_button.checkbox;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class CheckBox12 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    SharedPreferences sharedPreferences;
    CheckBox checkBox1, checkBox2;
    public final boolean checkboxState = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box12);

        checkBox1 = findViewById(R.id.checkBox23);
        checkBox2 = findViewById(R.id.checkBox24);
        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            checkBox1.setText("CheckBox Checked");
            checkBox2.setText("Checkbox checked");
        } else {
            checkBox1.setText("The CheckBox is not Checked");
            checkBox1.setText("The CheckBox is not Checked");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPreferences = getPreferences(0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("CHECK_BOX_VALUE", checkBox1.getText().toString());
        editor.putBoolean("CH", checkBox1.isChecked());
        editor.commit();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPreferences = getPreferences(0);
        boolean checkBoxValue = sharedPreferences.getBoolean("CH", false);
        String chBoxString = sharedPreferences.getString("CHECK_BOX_VALUE", "This is my CheckBox");
        checkBox1.setChecked(checkBoxValue);
        checkBox1.setText(chBoxString);
    }
}

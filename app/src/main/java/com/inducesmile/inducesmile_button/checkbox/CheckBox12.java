package com.inducesmile.inducesmile_button.checkbox;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

import com.inducesmile.inducesmile_button.R;

public class CheckBox12 extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Context context = getApplicationContext();
    CheckBox checkBox1;
    public boolean checkboxState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box12);

        checkBox1 = findViewById(R.id.checkBox23);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("state", checkboxState);
        editor.apply();

        boolean isChecked = sharedPreferences.getBoolean("state", checkboxState);



    }
}

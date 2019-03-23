package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.inducesmile.inducesmile_button.R;

public class CheckBox15 extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_check_box15);
        addPreferencesFromResource(R.xml.checkbox_pref);
    }
}

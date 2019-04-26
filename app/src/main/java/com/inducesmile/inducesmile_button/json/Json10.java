package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

public class Json10 extends AppCompatActivity {

    private static final String JSON_FILE_NAME = "raw.json";
    private String mJsonString;
    private TextView mTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json10);
    }

    private void loadLocalJson(){

    }
}

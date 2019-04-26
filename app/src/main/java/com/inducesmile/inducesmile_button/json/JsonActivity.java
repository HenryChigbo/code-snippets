package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

public class JsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_activity);

        Bundle bundle = getIntent().getExtras();
        JavaObjects javaObjects = (JavaObjects) bundle.getParcelable("Key");

        TextView textView = findViewById(R.id.text);
        textView.setText(javaObjects.toString());
    }

}

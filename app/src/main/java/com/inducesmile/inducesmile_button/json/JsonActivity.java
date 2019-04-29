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
        JavaObjects javaObjects = bundle.getParcelable("Key");

        TextView textView = findViewById(R.id.text);
        TextView textView2 = findViewById(R.id.text2);
        TextView textView3 = findViewById(R.id.text3);
        //textView.setText(javaObjects.toString());

        //Nested Object
        ContactInfo.Address contactInfo = getIntent().getParcelableExtra("key");
        //textView2.setText(contactInfo.toString());

        //Nested Object with Date
        ContactInfo.Address date = getIntent().getParcelableExtra("date");
        textView3.setText(date.toString());
    }

}

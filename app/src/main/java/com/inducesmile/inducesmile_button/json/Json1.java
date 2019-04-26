package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONArray;

public class Json1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json1);

        JSONArray jsonArray = new JSONArray();
        jsonArray.put("Nigeria");
        jsonArray.put("Ghana");
        jsonArray.put("Algeria");
        jsonArray.put("Togo");

        String text = jsonArray.toString();
        TextView jsonTextView = findViewById(R.id.text);
        jsonTextView.setText(text);
    }
}

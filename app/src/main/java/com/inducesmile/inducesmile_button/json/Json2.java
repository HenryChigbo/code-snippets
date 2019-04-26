package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONException;
import org.json.JSONObject;

public class Json2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json2);

        JSONObject jsonObject1 = new JSONObject();
        try {
            jsonObject1.put("Name", "Peter");
            jsonObject1.put("Country", "Nigeria");
            jsonObject1.put("State", "Lagos");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String text = jsonObject1.toString();
        TextView jsonTextView = findViewById(R.id.text);
        jsonTextView.setText(text);
    }
}

package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONException;
import org.json.JSONObject;

public class Json8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json8);

        TextView jsonObjectTextview = findViewById(R.id.text);

        String jsonString = "{\n" +
                "\t\t\t\"Name\": \"Pascal Made Simple\",\n" +
                "\t\t\t\"price\": 700\n" +
                "\t\t}";

        //Creating JSONObject from String
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            jsonObjectTextview.setText(jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}

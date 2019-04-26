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

        String jsonString = "{\"firstName\":\"Peter\",\"Country\":\"Nigeria\",\"State\":\"Lagos State\"}";
        try {
            JSONObject jsonObject =  new JSONObject(jsonString);
            JSONObject jsonObject1 = jsonObject.getJSONObject("json");
            String jsonObjectText = jsonObject1.getString("js");
            String js;
            js = jsonObject1.getString(jsonObjectText);
            jsonObjectTextview.setText(js);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}

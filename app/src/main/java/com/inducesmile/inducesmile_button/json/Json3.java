package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json3 extends AppCompatActivity {

    String jsonString = "{\"firstName\":\"Peter\",\"Country\":\"Nigeria\",\"State\":\"Lagos State\"}";
    String className = Json3.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json3);

        int id;
        String name;

        try {
            JSONArray array = new JSONArray(jsonString);
            for (int i = 0; i < array.length(); i++){
                JSONObject jsonObject = array.getJSONObject(i);
                id = jsonObject.getInt("id");
                name = jsonObject.getString("name");

                Log.d(className, "ITeration " + name + id);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

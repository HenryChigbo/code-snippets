package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json3 extends AppCompatActivity {

    String jsonString = "{ \"Employee\" :[{\"id\":\"101\",\"name\":\"Peter Dada\",\"salary\":\"50000\"}, {\"id\":\"102\",\"name\":\"John Smith\",\"salary\":\"60000\"}," +
            "{\"id\":\"103\",\"name\":\"Zacheus Zedd\",\"salary\":\"80000\"}] }";

    String className = Json3.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json3);

        TextView textView = findViewById(R.id.text);

        try {
            JSONObject object = new JSONObject(jsonString);
            JSONArray array = object.optJSONArray("Employee");
            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject = array.getJSONObject(i);

                int id = Integer.parseInt(jsonObject.optString("id"));
                String firstname = jsonObject.optString("name");
                float salary = Float.parseFloat(jsonObject.optString("salary"));

                String data = "";
                data += "Node" + i++ +" : \n id= "+ id +" \n Name= "+ firstname +" \n Salary= "+ salary +" \n ";
                textView.setText(data);
            }
        } catch (JSONException e) {
            Log.w(className, "Could not parse JSON. Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

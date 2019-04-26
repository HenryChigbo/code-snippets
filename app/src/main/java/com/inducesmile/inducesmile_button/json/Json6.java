package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class Json6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json6);

        //JSONArray
        JSONArray jsonArray = new JSONArray();
        jsonArray.put("Nigeria");
        jsonArray.put("Ghana");
        jsonArray.put("Algeria");
        jsonArray.put("Togo");

        ArrayList<String> jsonList = new ArrayList<>();
        if (jsonArray != null){
            int lenght = jsonArray.length();
            for (int i = 0; i <= lenght; i++){
                try {
                    jsonList.add(jsonArray.get(i).toString());
                    jsonList.toString();
                    Toast.makeText(getApplicationContext(), "The text in the JSONArray are:" + jsonList, Toast.LENGTH_LONG).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

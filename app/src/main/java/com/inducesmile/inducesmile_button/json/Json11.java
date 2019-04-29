package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONException;
import org.json.JSONObject;

public class Json11 extends AppCompatActivity {

    private static final String TAG = Json11.class.getSimpleName();
    String jsonStr = " { \"name\":\"James\" }";
    String name, firstname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json11);

        try {
            JSONObject object = new JSONObject(jsonStr);

            //Check if key exist
            if (object.has("name")){
                name = object.getString("name");
                Toast.makeText(getApplicationContext(), "Key exist", Toast.LENGTH_LONG).show();
            } else {
                name = "John";
            }

            if (object.has("surname")){
                firstname = object.getString("surname");
                Toast.makeText(getApplicationContext(), "Key does not exist", Toast.LENGTH_LONG).show();
            } else {
                firstname = "Doe";
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.w(TAG, e.getMessage());
        }
    }
}

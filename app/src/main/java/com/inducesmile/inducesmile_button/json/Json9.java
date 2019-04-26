package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Json9 extends AppCompatActivity {

    String jsonString = "{\"firstName\":\"Peter\",\"Country\":\"Nigeria\",\"State\":\"Lagos State\"}";
    Object json = new JSONTokener(jsonString).nextValue();

    public Json9() throws JSONException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json9);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (json instanceof JSONObject) {
                    Toast.makeText(getApplicationContext(), "JSON is an object", Toast.LENGTH_LONG).show();
                }else if (json instanceof JSONArray){
                    Toast.makeText(getApplicationContext(), "Json is an Array", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

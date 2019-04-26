package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inducesmile.inducesmile_button.R;

import java.util.HashMap;

public class Json12 extends AppCompatActivity {

    static String jsonString = "{\"firstName\":\"Peter\",\"Country\":\"Nigeria\",\"State\":\"Lagos State\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json12);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //json2HashMap();
                button.setVisibility(View.GONE);
                jsonHashmap();
            }
        });
    }

    public void jsonHashmap() {
        HashMap<String, String> map = new Gson().fromJson(jsonString, new TypeToken<HashMap<String, String>>(){}.getType());
        TextView textView = findViewById(R.id.text);
        textView.setText(map.toString());
    }
}

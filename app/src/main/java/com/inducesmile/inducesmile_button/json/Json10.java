package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inducesmile.inducesmile_button.R;

import java.lang.reflect.Type;
import java.util.List;

public class Json10 extends AppCompatActivity {

    private static final String JSON_FILE_NAME = "raw.json";
    private String mJsonString;
    private TextView mTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json10);

        TextView textView = findViewById(R.id.text);

        Gson gson = new Gson();

        Type type = new TypeToken<List<String>>() {}.getType();
        List<String> name = gson.fromJson(JSON_FILE_NAME, type);

        //textView.setText(name.toString());
        Log.v("Names", name.toString());
    }
}

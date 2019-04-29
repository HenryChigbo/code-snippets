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

public class Json4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json4);

        TextView textView = findViewById(R.id.text);

        Gson gson = new Gson();
        String json = "[ \"Adam\", \"John\", \"Mary\" ]";

        Type type = new TypeToken<List<String>>(){}.getType();
        List<String> name = gson.fromJson(json, type);

        textView.setText(name.toString());
        Log.v("Names", name.toString());
    }
}

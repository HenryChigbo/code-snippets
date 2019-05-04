package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inducesmile.inducesmile_button.R;

import org.json.JSONException;

import java.lang.reflect.Type;
import java.util.List;

public class Json7 extends AppCompatActivity {

    String jsonString = "[ " +
            "{\"id\":\"101\",\"name\":\"Peter Dada\",\"salary\":\"50000\"}, " +
            "{\"id\":\"102\",\"name\":\"John Smith\",\"salary\":\"60000\"}," +
            "{\"id\":\"103\",\"name\":\"Zacheus Zedd\",\"salary\":\"80000\"}" +
            "]";
    final TextView textView = findViewById(R.id.text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json7);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void json2Array(View view) throws JSONException {
        Gson gson = new Gson();
        //ArrayList<?> jsonArray = new Gson().fromJson(jsonString, ArrayList.class);
        //textView.setText(jsonArray.toString());
        Employee[] employeesArray = gson.fromJson(jsonString, Employee[].class);
        Type type = new TypeToken<List<Employee>>(){}.getType();
        List<Employee> employees = gson.fromJson(jsonString, type);
        textView.setText(employeesArray.toString());
    }
    public class Employee{
        private int id;
        private String name;
        private int salary;
    }
}

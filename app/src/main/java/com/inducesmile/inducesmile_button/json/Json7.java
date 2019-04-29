package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.inducesmile.inducesmile_button.R;

public class Json7 extends AppCompatActivity {

    String jsonString = "[{\"id\":\"101\",\"name\":\"Peter Dada\",\"salary\":\"50000\"}, " +
            "{\"id\":\"102\",\"name\":\"John Smith\",\"salary\":\"60000\"}," +
            "{\"id\":\"103\",\"name\":\"Zacheus Zedd\",\"salary\":\"80000\"}]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json7);

        final TextView textView = findViewById(R.id.text);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gson gson = new Gson();
                //ArrayList<?> jsonArray = new Gson().fromJson(jsonString, ArrayList.class);
                //textView.setText(jsonArray.toString());
                Employee[] employeesArray = gson.fromJson(jsonString, Employee[].class);
               textView.setText(employeesArray.toString());
                //Type type = new TypeToken<List<Employee>>(){}.getType();
                //ArrayList<Employee> employees = gson.fromJson(jsonString, type);
                //textView.setText(employees.toString());
                //Type type = new TypeToken<ArrayList<?> >(){}.getType();
                //ArrayList<?> jsonArray = new Gson().fromJson(jsonString, ArrayList.class);
                //textView.setText(jsonArray.toString());
                //json2Array(textView);
               // Toast.makeText(getApplicationContext(), "JSON converted to ArrayList successfully" + employees, Toast.LENGTH_LONG).show();
            }
        });
    }

//    public void json2Array(View view) throws JSONException {
//        Gson gson = new Gson();
//        //ArrayList<?> jsonArray = new Gson().fromJson(jsonString, ArrayList.class);
//        //textView.setText(jsonArray.toString());
//        Employee[] employeesArray = gson.fromJson(jsonString, Employee[].class);
//        Type type = new TypeToken<List<Employee>>(){}.getType();
//        List<Employee> employees = gson.fromJson(jsonString, type);
//        textView.setText(employeesArray.toString());
//    }
    public class Employee{
        private int id;
        private String name;
        private int salary;
    }
}

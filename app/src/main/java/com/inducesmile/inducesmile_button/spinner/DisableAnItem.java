package com.inducesmile.inducesmile_button.spinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisableAnItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disable_an_item);

        Spinner spinner = findViewById(R.id.spinner);

        String [] social = {"Facebook", "Linkedln",
                "Instagram", "Twitter", "Pinterset", "Snapchat"};

        final List<String> socialMedia = new ArrayList<>(Arrays.asList(social));

        //Initializing an ArrayAdapter
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, socialMedia){

            @Override
            public boolean isEnabled(int position) {
                if (position == 1){
                    // Disable the second item from Spinner
                    return  false;
                } else {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView textView = (TextView) view;
                if (position == 1){
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    textView.setTextColor(getResources().getColor(R.color.colorPrimary));
                }
                return view;
            }
        };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

}

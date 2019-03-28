package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inducesmile.inducesmile_button.R;
import com.inducesmile.inducesmile_button.checkbox.CheckboxAdapter.Frameworks;

import java.util.ArrayList;

public class CheckBox7 extends AppCompatActivity {

    CheckboxAdapter checkboxAdapter;
    ArrayList <Frameworks> frameworks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box7);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        checkboxAdapter = new CheckboxAdapter(CheckBox7.this, frameworks);
        recyclerView.setAdapter(checkboxAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}

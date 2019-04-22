package com.inducesmile.inducesmile_button.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RadioGroup;

import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;

public class Animation9 extends AppCompatActivity {

    AnimationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation9);

        final RadioGroup radioGroup = findViewById(R.id.radiogroup);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
            arrayList.add("ITEM " + i);

        adapter = new AnimationAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recycler view

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Finding ID/Position of radio group child
                int pos = radioGroup.indexOfChild(findViewById(checkedId));
                adapter.changeActionType(pos);
            }
        });

    }
}

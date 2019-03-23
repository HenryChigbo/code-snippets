package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CheckBox6 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView tv = new TextView(this);
        tv.setText("Add and Remove Checkbox Programmatically");
        tv.setPadding(20, 20, 20, 20);
        ll.addView(tv);

        Button addButton = new Button(this);
        addButton.setText("Add Checkbox dynamically");
        ll.addView(addButton);

        Button removeButton = new Button(this);
        removeButton.setText("Remove Checkbox");
        ll.addView(removeButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox firstCheckBox = new CheckBox(getApplicationContext());
                firstCheckBox.setTag("First CheckBox");
                firstCheckBox.setText("Checkbox");
                ll.addView(firstCheckBox);
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox retrieveFirstCheckBox = ll.findViewWithTag("First CheckBox");
                ll.removeView(retrieveFirstCheckBox);
            }
        });

        this.setContentView(ll);
    }
}


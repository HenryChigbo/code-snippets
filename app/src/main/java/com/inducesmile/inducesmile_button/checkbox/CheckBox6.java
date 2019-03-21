package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CheckBox6 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_check_box6);

        //final CheckBox cb = new CheckBox(getApplicationContext());
        //cb.setText("Checkbox");

        ScrollView sv = new ScrollView(this);
        final LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        sv.addView(ll);

        TextView tv = new TextView(this);
        tv.setText("Add and Remove Checkbox Programmatically");
        tv.setPadding(20, 20, 20, 20);
        ll.addView(tv);

        Button b = new Button(this);
        b.setText("Add Checkbox dynamically");
        ll.addView(b);

        Button removeButton = new Button(this);
        removeButton.setText("Remove Checkbox");
        ll.addView(removeButton);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 1; i++) {
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText("CheckBox");
                    ll.addView(cb);
                }
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i <= 1; i--){
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText("CheckBox");
                    ll.removeViewAt(i);
                }
            }
        });

        this.setContentView(sv);

    }
}


package com.inducesmile.inducesmile_button.checkbox;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

public class CheckBox8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box8);

        Button button = findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a alert dialog builder.
                final AlertDialog.Builder builder = new AlertDialog.Builder(CheckBox8.this);
                // Set icon value.
                builder.setIcon(R.mipmap.ic_launcher);
                // Set title value.
                builder.setTitle("Alert Dialog with CheckBox");

                // Get custom login form view.
                final View customView = getLayoutInflater().inflate(R.layout.custom_check_box, null);
                // Set above view in alert dialog.
                builder.setView(customView);
                builder.setCancelable(true);

                final AlertDialog alertdialog = builder.create();
                alertdialog.show();
            }

        });
    }
}

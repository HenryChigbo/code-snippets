package com.inducesmile.inducesmile_button.progressbar;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar20);

        Button button = findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a alert dialog builder.
                final AlertDialog.Builder builder = new AlertDialog.Builder(ProgressBar20.this);
                // Set icon value.
                builder.setIcon(R.mipmap.ic_launcher);
                // Set title value.
                builder.setTitle("Custom View Alert Dialog");

                // Get custom login form view.
                final View customView = getLayoutInflater().inflate(R.layout.custom_alert_dialog_view, null);
                // Set above view in alert dialog.
                builder.setView(customView);
                builder.setCancelable(true);

                final AlertDialog alertdialog = builder.create();
                alertdialog.show();
            }

        });

    }
}

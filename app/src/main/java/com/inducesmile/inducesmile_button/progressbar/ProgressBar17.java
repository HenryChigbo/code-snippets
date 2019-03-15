package com.inducesmile.inducesmile_button.progressbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar17);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("InduceSmile Code Snippet");
        builder.setMessage("This is Alert Dialog Box with Positive and Negative Button")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getApplicationContext(), "This is a positive button", Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getApplicationContext(), "This is a negative button", Toast.LENGTH_LONG).show();

                    }
                });
        final AlertDialog alertdialog = builder.create();
        alertdialog.show();

    }
}

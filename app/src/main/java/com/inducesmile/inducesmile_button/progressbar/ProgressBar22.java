package com.inducesmile.inducesmile_button.progressbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar22);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("InduceSmile Code Snippet");
        builder.setMessage("This is Alert Dialog Box with Positive and Negative Button with a custom position");
        builder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        final AlertDialog alertdialog = builder.create();
        alertdialog.show();

        alertdialog.getWindow().setGravity(Gravity.BOTTOM);
    }
}

package com.inducesmile.inducesmile_button.progressbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar19);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("InduceSmile Code Snippet");
        builder.setMessage("This is Alert Dialog Box with Positive and Negative Button");
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

        //Overriding the handler immediately after show is probably a better approach than
        // OnShowListener as described below
        alertdialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Boolean wantToCloseDialog = false;
                //Do stuff, possibly set wantToCloseDialog to true then...
                if(wantToCloseDialog)
                    alertdialog.dismiss();
                //else dialog stays open. Make sure you have an obvious way to close the dialog especially if you
                // set cancellable to false.
            } });

        alertdialog.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Boolean wantToCloseDialog = false;
                //Do stuff, possibly set wantToCloseDialog to true then...
                if(wantToCloseDialog)
                    alertdialog.dismiss();
                //else dialog stays open. Make sure you have an obvious way to close the dialog especially if                     you set cancellable to false.
            } });
    }
}

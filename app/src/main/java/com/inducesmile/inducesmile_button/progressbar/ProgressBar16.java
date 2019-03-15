package com.inducesmile.inducesmile_button.progressbar;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar16);

        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.Theme_Holo_Dialog_Alert));
        builder.setTitle("InduceSmile Code Snippet");
        builder.setMessage("Changing the theme associated with the AlertDialog Widget in Android, find more solution on https://inducesmile.com");
        AlertDialog alertdialog = builder.create();
        alertdialog.show();
    }
}

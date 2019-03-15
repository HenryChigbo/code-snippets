package com.inducesmile.inducesmile_button.progressbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar11);

        ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Set ProgressBar MaxValue ");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setMax(80);
        progress.show();

    }
}

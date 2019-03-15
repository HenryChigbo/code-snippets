package com.inducesmile.inducesmile_button.progressbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar13);

        ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Loading InduceSmile ");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setIndeterminate(true);
        progress.show();
        progress.getWindow().setGravity(Gravity.BOTTOM);
    }
}

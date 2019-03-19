package com.inducesmile.inducesmile_button.progressbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar15);

        ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Loading InduceSmile ");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setIndeterminate(true);
        progress.hide();
        progress.cancel();

        Toast.makeText(getApplicationContext(), "ProgressDialog Hide", Toast.LENGTH_LONG).show();
    }
}

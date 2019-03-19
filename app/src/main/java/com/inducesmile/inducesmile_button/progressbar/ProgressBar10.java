package com.inducesmile.inducesmile_button.progressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.inducesmile.inducesmile_button.R;

public class ProgressBar10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar10);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(60);
        progressBar.getProgress();
    }
}

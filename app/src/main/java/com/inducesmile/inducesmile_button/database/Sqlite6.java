package com.inducesmile.inducesmile_button.database;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static com.inducesmile.inducesmile_button.database.DBObject.DATABASE_NAME;

public class Sqlite6 extends AppCompatActivity {

    public static String PACKAGE_NAME;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite6);

        PACKAGE_NAME = getApplicationContext().getPackageName();
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exportDB();
            }
        });

    }

    private void exportDB() {
        try {
            File direct = new File(Environment.getExternalStorageDirectory() + "/Inducesmile/");
            if(!direct.exists()) {
                if(direct.mkdir()) {
                    //directory is created;
                }
            }

            String backupDBPath = ".../Inducesmile/";
            File dbFile = new File(this.getDatabasePath(DATABASE_NAME).getAbsolutePath());
            FileInputStream fis = new FileInputStream(dbFile);

            String outFileName = backupDBPath + File.separator +
                    DATABASE_NAME + ".db";

            // Open the empty db as the output stream
            OutputStream output = new FileOutputStream(outFileName);

            // Transfer bytes from the inputfile to the outputfile
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            // Close the streams
            output.flush();
            output.close();
            fis.close();


        } catch (IOException e) {
            Log.e("dbBackup:", e.getMessage());
        }
    }}

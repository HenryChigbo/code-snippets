package com.inducesmile.inducesmile_button.database;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

public class Sqlite14 extends AppCompatActivity {

    private EditText editText;
    private Button button;
    DatabaseHelper databaseHelper;
    public static SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite14);
        //sqLiteDatabase.loadLibs(this);

        databaseHelper = new DatabaseHelper(this);

        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.insert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isInserted = databaseHelper.insert(editText.getText().toString());
                if (isInserted == true){
                    Toast.makeText(getApplicationContext(), "Data Saved Successfully with Encryption", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Data not Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}

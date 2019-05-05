package com.inducesmile.inducesmile_button.database;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.inducesmile.inducesmile_button.R;

public class Sqlite17 extends AppCompatActivity {

    private EditText editText;
    private Button button;
    DBHandler dbHandler;
    DBObject dbObject;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite17);
        dbObject.onOpen(db);
        Log.w(Sqlite17.class.getSimpleName(), "Database Open");
    }


    @Override
    protected void onStart() {
        super.onStart();
    }
}

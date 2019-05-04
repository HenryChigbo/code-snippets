package com.inducesmile.inducesmile_button.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class Sqlite1 extends AppCompatActivity {

    private EditText editText;
    private Button button;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite1);
        databaseHelper = new DatabaseHelper(this);

        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.insert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isInserted = databaseHelper.insert(editText.getText().toString());
                if (isInserted == true){
                    Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Data not Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public class DatabaseHelper extends SQLiteOpenHelper{

        public static final String DATABASE_NAME = "sqlite.db";
        public static final String TABLE_NAME = "sqlite_table";
        public static final String COL_1 = "ID";
        public static final String COL_2 = "TEXT";

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null,1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table  TABLE_NAME " +
                    " (ID INTEGER PRIMARY KEY, TEXT NAME)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        }

        public boolean insert(String text){
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_2, text);
            database.insert(TABLE_NAME, null, contentValues);
            return true;
        }
    }
}

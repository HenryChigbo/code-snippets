package com.inducesmile.inducesmile_button.database;

import android.content.ContentValues;
import android.content.Context;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "sqlite.db";
    public static final String TABLE_NAME = "sqlite_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "TEXT";
    SQLiteDatabase sqLiteDatabase;

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
        SQLiteDatabase database = this.getWritableDatabase("password");
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, text);
        database.insert(TABLE_NAME, null, contentValues);
        return true;
    }
}

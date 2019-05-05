package com.inducesmile.inducesmile_button.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.inducesmile.inducesmile_button.BuildConfig;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DBObject extends SQLiteOpenHelper {

    //Database Schema
    public static final String DATABASE_NAME = "DB";
    public static final String TABLE_NAME = "Contact";
    public static final String Column_1 = "id";
    public static final String Column_2 = "Name";
    private static final int DATABASE_VERSION = 2;

    public static String DB_PATH = "/data/data/" + BuildConfig.APPLICATION_ID + "/databases/";
    public static String DB_NAME = "database.db";

    public static void setDefaultDataBase(Context context) {
        try {
            InputStream myInput = context.getAssets().open(DB_NAME);
            // Path to the just created empty db
            String outFileName = DB_PATH + DB_NAME;
            //Open the empty db as the output stream
            OutputStream myOutput = new FileOutputStream(outFileName);
            //transfer bytes from the inputfile to the outputfile
            byte[] buffer = new byte[1024];
            int length;
            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }
            //Close the streams
            myOutput.flush();
            myOutput.close();
            myInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    SQLiteDatabase db;

    public DBObject(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /*Create Table if not exists*/
        String query = "Create table if not exists " + TABLE_NAME + "(" + Column_1 + " Integer , " + Column_2 + " varchar(50))";
        db.execSQL(query);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        db.isOpen();
    }

    public void clearDatabase(String TABLE_NAME) {
        String clearDBQuery = "DELETE FROM "+TABLE_NAME;
        db.execSQL(clearDBQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*Drop table when the database version change*/
        Log.w(DBObject.class.getSimpleName(), "Upgrading Database from version " + oldVersion + " to " + newVersion + "which will destroy old data");
        db.execSQL("drop table if exists " + TABLE_NAME + ";");
        onCreate(db);
    }

    /*Method Return Max+1 id*/
    public int getMaxID() {
        db = getReadableDatabase();
        Cursor cur = db.rawQuery("Select NULLIF(max(" + Column_1 + "),0) from " + TABLE_NAME, null);
        int max = 0;
        if (cur.getCount() > 0) {
            cur.moveToNext();
            max = cur.getInt(0);
        }
        cur.close();
        return max + 1;
    }

    /*Insert With new name*/
    public void insert(String name) {
        db = getWritableDatabase();
        int max = getMaxID();
        db.execSQL("insert into " + TABLE_NAME + " (" + Column_1 + ", " + Column_2 + ") values(" + max + ",'" + name + "');");
    }

    /*Update with new name*/
    public void update(int id, String name) {
        db = getWritableDatabase();
        db.execSQL("update " + TABLE_NAME + " set " + Column_2 + " = '" + name + "' where " + Column_1 + " = " + id + ";");
    }

    /*Delete Name*/
    public void delete(int id) {
        db = getWritableDatabase();
        db.execSQL("delete from " + TABLE_NAME + " where " + Column_1 + " = " + id + ";");
    }

    /*Return All the saved data as Cursor*/
    public Cursor view() {
        Cursor cur = db.rawQuery("Select * from " + TABLE_NAME, null);
        return cur;
    }

    /*Returns true if exists else false*/
    public boolean checkExists(String name) {
        Cursor cur = db.rawQuery("Select * from " + TABLE_NAME + " where " + Column_2 + " = '" + name + "'", null);
        return cur.getCount() > 0 ? true : false;
    }
}

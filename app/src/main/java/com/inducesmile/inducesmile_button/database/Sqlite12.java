package com.inducesmile.inducesmile_button.database;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.ListAdapter;

public class Sqlite12 extends ListActivity {

    ExternalDB db;
    private Cursor employees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        db = new ExternalDB(this);
        employees = db.getEmployees(); // you would not typically call this on the main thread

        ListAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                employees,
                new String[]{"FirstName"},
                new int[]{android.R.id.text1});

        getListView().setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        employees.close();
        db.close();
    }
}

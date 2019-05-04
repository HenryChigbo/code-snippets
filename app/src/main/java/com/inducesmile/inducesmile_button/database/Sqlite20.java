package com.inducesmile.inducesmile_button.database;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;

public class Sqlite20 extends AppCompatActivity {

    Cursor cur;
    ArrayAdapter adapter;
    TextView txtId;
    ListView listView;
    EditText txtName;
    DBObject sqlite;
    ArrayList<Contact> list;
    ArrayList<String> arrayList;
    Contact pojo;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite20);

        /*Init DBOject*/
        sqlite = new DBObject(getApplicationContext());
        txtName = findViewById(R.id.name);
        listView =  findViewById(R.id.listView);
        txtId = findViewById(R.id.txtId);
        /*Get Max+1 for new Name*/
        int max = sqlite.getMaxID();
        /*Set the int value by converting it into string*/
        txtId.setText(String.valueOf(max));
    }

    /*Add Name*/
    public void add(View view) {
        /*Set Name in variable*/
        String name = txtName.getText().toString();
        /*Check name is blank or not*/
        if (name.isEmpty()) {
            /*show toast if blank*/
            Toast.makeText(getApplicationContext(), "Field Empty", Toast.LENGTH_SHORT).show();
        } else {
            /*Check for name exists or not*/
            boolean checkExist = sqlite.checkExists(name);
            if (checkExist) {
                /*If exists then don't allow to save*/
                Toast.makeText(getApplicationContext(), "Name Already Exists!", Toast.LENGTH_SHORT).show();
            } else {
                /*Insert if not saved*/
                sqlite.insert(name);
                Toast.makeText(getApplicationContext(), "Name Inserted Successfully!", Toast.LENGTH_SHORT).show();
                /*After Saving, set the id to Max+1 and set the name with blank*/
                txtId.setText(String.valueOf(sqlite.getMaxID()));
                txtName.setText("");
            }
        }
    }

    public void reset (View view){
        sqlite.clearDatabase(DBObject.TABLE_NAME);
        Toast.makeText(getApplicationContext(), "Database Cleared", Toast.LENGTH_LONG).show();
    }

    /*View saved name*/
    public void view(View view) {
        /*Store the data in Cursor*/
        cur = sqlite.view();
        list = new ArrayList<>();
        arrayList = new ArrayList<>();

        /*If cur not null and cur length is greater than 0*/
        if (cur != null && cur.getCount() > 0) {
            /*set value to list one by one*/
            while (cur.moveToNext()) {
                int id = cur.getInt(0);
                String name = cur.getString(1);
                pojo = new Contact(id, name);
                /*add the pojo object in list for Item CLick Listener for listview*/
                list.add(pojo);
                /*Add Name in the Lists for displaying in listview*/
                arrayList.add(name);
            }
            /*Set the adaptor to listview*/
            adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int ID = list.get(position).getContactID();
                    String name = list.get(position).getContactName();
                    /*Set the id and name when click on any item*/
                    txtId.setText(String.valueOf(ID));
                    txtName.setText(name);
                }
            });
        }
    }
}

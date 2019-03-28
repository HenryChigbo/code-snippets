package com.inducesmile.inducesmile_button.checkbox;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;
import java.util.List;

public class CheckBox18 extends AppCompatActivity {

    List<JavaScriptFrameworks> javaScriptFrameworksList;
    ListView listView;
    JSFrameworksListAdapter jsFrameworksListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box18);
        listView = findViewById(R.id.listView);

        initItems();
        jsFrameworksListAdapter = new JSFrameworksListAdapter(this, javaScriptFrameworksList);
        listView.setAdapter(jsFrameworksListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(CheckBox18.this,
                        ((JavaScriptFrameworks) (parent.getItemAtPosition(position))).jsFrameworks,
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initItems() {
        javaScriptFrameworksList = new ArrayList<>();

        TypedArray arrayText = getResources().obtainTypedArray(R.array.jsFrameworks);

        for (int i = 0; i < arrayText.length(); i++) {
            String s = arrayText.getString(i);
            boolean b = false;
            JavaScriptFrameworks item = new JavaScriptFrameworks(s);
            javaScriptFrameworksList.add(item);
        }

        arrayText.recycle();
    }

    public class JavaScriptFrameworks {
        boolean checked;
        String jsFrameworks;

        JavaScriptFrameworks(String jsFrameworks) {
            this.checked = checked;
            this.jsFrameworks = jsFrameworks;
        }

        public boolean isChecked() {
            return checked;
        }
    }

    static class ViewHolder {
        CheckBox checkBox;
        TextView textView;
    }

    public class JSFrameworksListAdapter extends BaseAdapter {

        private Context context;
        private List<JavaScriptFrameworks> list;

        public JSFrameworksListAdapter(Context context, List<JavaScriptFrameworks> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public boolean isChecked(int position) {
            return list.get(position).checked;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View rowView = convertView;

            // reuse views
            ViewHolder viewHolder = new ViewHolder();
            if (rowView == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                rowView = inflater.inflate(R.layout.custom_list, null);

                viewHolder.checkBox = rowView.findViewById(R.id.listCheckbox);
                viewHolder.textView = rowView.findViewById(R.id.listTextview);
                rowView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) rowView.getTag();
            }

            viewHolder.checkBox.setChecked(list.get(position).checked);

            final String itemStr = list.get(position).jsFrameworks;
            viewHolder.textView.setText(itemStr);

            viewHolder.checkBox.setTag(position);

            viewHolder.checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    boolean newState = !list.get(position).isChecked();
                    list.get(position).checked = newState;
                    Toast.makeText(getApplicationContext(),
                            itemStr + "setOnClickListener\nchecked: " + newState,
                            Toast.LENGTH_LONG).show();
                }
            });

            viewHolder.checkBox.setChecked(isChecked(position));

            return rowView;
        }
    }
}

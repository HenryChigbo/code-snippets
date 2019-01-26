package com.inducesmile.inducesmile_button.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int images[];
    String[] menu;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int[] images, String[] menu) {
        this.context = context;
        this.images = images;
        this.menu = menu;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.spinner_image_layout, null);
        ImageView image = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textview);
        image.setImageResource(images[position]);
        textView.setText(menu[position]);
        return view;
    }
}

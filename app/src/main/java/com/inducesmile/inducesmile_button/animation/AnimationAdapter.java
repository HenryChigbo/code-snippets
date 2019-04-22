package com.inducesmile.inducesmile_button.animation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;

public class AnimationAdapter extends RecyclerView.Adapter<AnimationAdapter.ViewHolder> {

    // recycler view adapter
    private ArrayList<String> arrayList;
    private Context context;

    private int clickType = 0;//Variable for changing action type on item click

    public AnimationAdapter(Context context,
                                ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AnimationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // This method will inflate the custom layout and return as view holder
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup viewHolder = (ViewGroup) mInflater.inflate(
                R.layout.recycle, viewGroup, false);
        return new ViewHolder(viewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimationAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.textView.setText(arrayList.get(i));
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.text:
                        switch (clickType){
                            case 0:
                                addItem(i);
                                break;
                            case 1:
                                deleteItem(i);
                                break;
                        }
                        break;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text);
        }
    }


    //Delete Item
    private void deleteItem(int position) {
        arrayList.remove(position);//remove from list
        notifyItemRemoved(position);//notify recycler view about item deletion
        Toast.makeText(context, "Item deleted successfully.", Toast.LENGTH_SHORT).show();//Toast
    }

    private void addItem(int position) {
        arrayList.add(position, "NEW ITEM " + position);//add item to list on selected position
        notifyItemInserted(position);//notify recycler view about item insertion
        Toast.makeText(context, "Item added successfully.", Toast.LENGTH_SHORT).show();//Toast
    }

    void changeActionType(int position) {
        clickType = position;
    }
}

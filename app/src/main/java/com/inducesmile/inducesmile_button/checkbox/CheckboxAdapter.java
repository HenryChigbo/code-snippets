package com.inducesmile.inducesmile_button.checkbox;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.R;

import java.util.List;

public class CheckboxAdapter extends RecyclerView.Adapter<CheckboxAdapter.ViewHolder> {

    private Context context;
    private List<Frameworks> list;

    public CheckboxAdapter(Context context, List<Frameworks> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CheckboxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.from(context).inflate(R.layout.custom_recyclerview_list, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CheckboxAdapter.ViewHolder viewHolder, int position) {
        final Frameworks frameworks = list.get(position);
        //viewHolder.recyclerTextview.setText(list.get.jsFrameworks);
        viewHolder.recyclerCheckbox.setChecked(frameworks.isChecked());
        viewHolder.recyclerCheckbox.setTag(list.get(position));
        viewHolder.recyclerCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView recyclerTextview;
        CheckBox recyclerCheckbox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerTextview = itemView.findViewById(R.id.recyclerView_textView);
            recyclerCheckbox = itemView.findViewById(R.id.recyclerView_checkbox);
        }
    }

    public class Frameworks {
        boolean checked;
        String jsFrameworks;

        Frameworks(String jsFrameworks) {
            this.checked = checked;
            this.jsFrameworks = jsFrameworks;
        }

        public boolean isChecked() {
            return checked;
        }
    }

}

package com.inducesmile.inducesmile_button.checkbox;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CheckboxAdapter extends RecyclerView.Adapter<CheckboxAdapter.ViewHolder> {

    private List<CheckboxList> checkboxLists;
    private Context context;

    @NonNull
    @Override
    public CheckboxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CheckboxAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class CheckboxList{

        private String checkbox;
        private boolean checked;

        public CheckboxList(String checkbox, boolean checked) {
            this.checkbox = checkbox;
            this.checked = checked;
        }

    }
}

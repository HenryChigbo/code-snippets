package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.inducesmile.inducesmile_button.Model;
import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;
import java.util.List;

public class RadioButton7 extends AppCompatActivity {

    private List<Model> modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ModelAdapter modelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button7);

        recyclerView = findViewById(R.id.recyclerView);
        modelAdapter = new ModelAdapter(modelList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(modelAdapter);
        modelData();
    }

    private void modelData () {
        Model model = new Model("Nigeria");
        modelList.add(model);

        model = new Model("Ghana");
        modelList.add(model);

        model = new Model("Argentina");
        modelList.add(model);

        model = new Model("Singapore");
        modelList.add(model);

        model = new Model("Switzerland");
        modelList.add(model);

        model = new Model("Togo");
        modelList.add(model);

        model = new Model("Kenya");
        modelList.add(model);

        model = new Model("Cameroon");
        modelList.add(model);

        modelAdapter.notifyDataSetChanged();
    }

    class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder>{

        private List<Model> models;

        public ModelAdapter(List<Model> models) {
            this.models = models;
        }

        @NonNull
        @Override
        public ModelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_model_row, viewGroup, false);

            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ModelAdapter.ViewHolder viewHolder, int i) {
            Model model = models.get(i);
            viewHolder.textView.setText(model.getText());
            viewHolder.radioButton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                }
            });
        }

        @Override
        public int getItemCount() {
            return models.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView textView;
            public RadioGroup radioButton;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.radio_button_textview);
                radioButton = itemView.findViewById(R.id.radioButton_custom);
            }

        }
    }
}

package com.inducesmile.inducesmile_button.json;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

public class Json14 extends AppCompatActivity {

    boolean isChecked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json14);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Json14.this, JsonActivity.class);
//                AddressInfo address = new AddressInfo("Lagos", "Nigeria", isChecked);
//                intent.putExtra("date", address);
//                startActivity(intent);
            }
        });
    }
}

package com.inducesmile.inducesmile_button.json;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

public class Json18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json18);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Json18.this, JsonActivity.class);
                intent.putExtra("Key",new JavaObjects("Peter", "Nigeria"));
                startActivity(intent);
            }
        });
    }
}

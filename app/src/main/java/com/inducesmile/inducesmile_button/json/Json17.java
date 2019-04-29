package com.inducesmile.inducesmile_button.json;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

public class Json17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json17);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Json17.this, JsonActivity.class);
                //ContactInfo Class
                //ContactInfo contactInfo = new ContactInfo();
                ContactInfo.Address address = new ContactInfo.Address("Lagos", "Nigeria");
                intent.putExtra("key", address);
                startActivity(intent);
            }
        });
    }
}

package com.inducesmile.inducesmile_button.json;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

import java.util.Calendar;
import java.util.Date;

public class Json15 extends AppCompatActivity {

    Date date = Calendar.getInstance().getTime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json15);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Json15.this, JsonActivity.class);
                //ContactInfo Class
                //ContactInfo contactInfo = new ContactInfo();
                ContactInfo.Address address = new ContactInfo.Address("Lagos", "Nigeria", date);
                intent.putExtra("date", address);
                startActivity(intent);
            }
        });
    }

}

package com.inducesmile.inducesmile_button.button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.inducesmile.inducesmile_button.R;

public class ChangeButtonColorActivity extends AppCompatActivity {

    private int buttonState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_button_color);

        final Button button = findViewById(R.id.button6);

        //Add OnClickEvents to the button that responds to the user event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonState % 2 == 0){
                   button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    Toast.makeText(getBaseContext(), "Button background color green", Toast.LENGTH_SHORT).show();
                }
                else{
                    button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    Toast.makeText(getBaseContext(), "Button background color accent", Toast.LENGTH_SHORT).show();
                }
                buttonState++;
            }
        });
    }
}

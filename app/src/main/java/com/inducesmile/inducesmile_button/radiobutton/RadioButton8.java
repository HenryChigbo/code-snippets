package com.inducesmile.inducesmile_button.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RadioButton;

import com.inducesmile.inducesmile_button.R;

public class RadioButton8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button8);

        RadioButton radioButton = findViewById(R.id.radioButton);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.radio_button_animation);
        radioButton.startAnimation(animation);
     }
}
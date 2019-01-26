package com.inducesmile.inducesmile_button.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.inducesmile.inducesmile_button.R;

public class ImageSpinner extends AppCompatActivity {

    String[] menu = {"Home", "Audio", "Photo", "Video"};
    int[] menuImages = {R.drawable.ic_home_black_24dp, R.drawable.ic_audiotrack_black_24dp,
            R.drawable.ic_photo_black_24dp, R.drawable.ic_video_library_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_spinner);

        Spinner spinner = findViewById(R.id.spinner);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), menuImages, menu);

//        // Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.social_media, android.R.layout.simple_spinner_item);
//
//        // Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}

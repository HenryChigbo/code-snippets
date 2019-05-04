package com.inducesmile.inducesmile_button.database;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.inducesmile.inducesmile_button.R;

public class Sqlite13 extends AppCompatActivity {

    public static final String IMAGE_ID = "IMG_ID";
    private final String TAG = "MainActivity";

    private DBHandler databaseHelper;
    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite13);

        databaseHelper = new DBHandler(this);
        imageView = (ImageView)findViewById(R.id.imageView);

        Drawable dbDrawable = getResources().getDrawable(R.drawable.notebook);
        databaseHelper.insetImage(dbDrawable, IMAGE_ID);

        new LoadImageFromDatabaseTask().execute(0);
    }

    private class LoadImageFromDatabaseTask extends AsyncTask<Integer, Integer, ImageHelper> {

        private final ProgressDialog LoadImageProgressDialog =  new ProgressDialog(Sqlite13.this);

        protected void onPreExecute() {
            this.LoadImageProgressDialog.setMessage("Loading Image from Db...");
            this.LoadImageProgressDialog.show();
        }

        @Override
        protected ImageHelper doInBackground(Integer... integers) {
            Log.d("LoadImageFromDb DIB", "");
            return databaseHelper.getImage(IMAGE_ID);
        }

        protected void onProgressUpdate(Integer... progress) {
        }

        protected void onPostExecute(ImageHelper imageHelper) {
            Log.d("LoadImageFromDb: OPE", imageHelper.getImageId());
            if (this.LoadImageProgressDialog.isShowing()) {
                this.LoadImageProgressDialog.dismiss();
            }
            setUpImage(imageHelper.getImageByteArray());
        }

    }


    private void setUpImage(byte[] bytes) {
        Log.d(TAG, "Decoding bytes");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        imageView.setImageBitmap(bitmap);
    }
}

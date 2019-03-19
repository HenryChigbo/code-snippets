package com.inducesmile.inducesmile_button.progressbar;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.inducesmile.inducesmile_button.R;

import java.util.ArrayList;
import java.util.List;

public class ProgressBar5 extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;

    private CoordinatorLayout mCLayout;

    private ProgressDialog mProgressDialog;
    private AsyncTask mMyTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the application context
        mContext = getApplicationContext();
        mActivity = ProgressBar5.this;

        // Get the widget reference from XML layout
        mCLayout = findViewById(R.id.coordinator_layout);

        Button mButtonDo = findViewById(R.id.btn_do);

        // Initialize the progress dialog
        mProgressDialog = new ProgressDialog(mActivity);
        mProgressDialog.setIndeterminate(false);
        // Progress dialog horizontal style
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        // Progress dialog title
        mProgressDialog.setTitle("AsyncTask with ProgressDialog");
        // Progress dialog message
        mProgressDialog.setMessage("Please wait, we are downloading your files...");

        // Initialize a new click listener for positive button widget
        mButtonDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Execute the async task
                mMyTask = new DownloadTask()
                        .execute(
                                "Task 1",
                                "Task 2",
                                "Task 3",
                                "Task 4",
                                "Task 5",
                                "Task 6",
                                "Task 7",
                                "Task 8",
                                "Task 9",
                                "Task 10"
                        );
            }
        });
    }

    private class DownloadTask extends AsyncTask<String,Integer,List<String>>{
        // Before the tasks execution
        protected void onPreExecute(){
            // Display the progress dialog on async task start
            mProgressDialog.show();
        }

        // Do the task in background/non UI thread
        protected List<String> doInBackground(String...tasks){
            // Get the number of task
            int count = tasks.length;
            // Initialize a new list
            List<String> taskList= new ArrayList<>(count);

            // Loop through the task
            for(int i =0;i<count;i++){
                // Do the current task here
                String currentTask = tasks[i];
                taskList.add(currentTask);

                // Sleep the thread for 1 second
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Publish the async task progress
                // Added 1, because index start from 0
                publishProgress((int) (((i+1) / (float) count) * 100));

                // If the AsyncTask cancelled
                if(isCancelled()){
                    break;
                }
            }
            // Return the task list for post execute
            return taskList;
        }

        // After each task done
        protected void onProgressUpdate(Integer... progress){
            // Update the progress bar on dialog
            mProgressDialog.setProgress(progress[0]);
        }

        // When all async task done
        protected void onPostExecute(List<String> result){
            // Hide the progress dialog
            mProgressDialog.dismiss();

            for (int i=0;i<result.size();i++){
                // Do something here
            }
        }
    }
}

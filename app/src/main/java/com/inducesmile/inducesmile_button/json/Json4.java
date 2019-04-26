package com.inducesmile.inducesmile_button.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.inducesmile.inducesmile_button.R;

public class Json4 extends AppCompatActivity {

    private static final String JSON_FILE_NAME = "raw.json";
    private String mJsonString;
    private TextView mTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json4);

        Gson gson = new Gson();
        RawJSON rawJSON = gson.fromJson(mJsonString, );
    }

    public class RawJSON {
        @SerializedName("Id")
        public long id;

        @SerializedName("CompanyDetails")
        public CompanyDetails companyDetails;

    }

    public class CompanyDetails{
        public String company_name;
        public String website;
        public String industry;
    }
}

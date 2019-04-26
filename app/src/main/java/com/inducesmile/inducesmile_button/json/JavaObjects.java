package com.inducesmile.inducesmile_button.json;

import android.os.Parcel;
import android.os.Parcelable;

public class JavaObjects implements Parcelable {

    private String name;
    private String country;

    public JavaObjects(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public JavaObjects(Parcel source){
        name = source.readString();
        country = source.readString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static final Creator<JavaObjects> CREATOR = new Creator<JavaObjects>() {
        @Override
        public JavaObjects createFromParcel(Parcel in) {
            return new JavaObjects(in);
        }

        @Override
        public JavaObjects[] newArray(int size) {
            return new JavaObjects[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(country);
    }

    @Override
    public String toString() {
        return "JavaObjects{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

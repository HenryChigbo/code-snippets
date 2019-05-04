package com.inducesmile.inducesmile_button.json;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {

    String name, address, sex;

    public Contact(String name, String address, String sex) {
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    protected Contact(Parcel in) {
        name = in.readString();
        address = in.readString();
        sex = in.readString();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(sex);
    }
}

package com.inducesmile.inducesmile_button.json;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class AddressInfo implements Parcelable {


    public static final Creator<ContactInfo.Address> CREATOR = new Creator<ContactInfo.Address>() {
        @Override
        public ContactInfo.Address createFromParcel(Parcel in) {
            return new ContactInfo.Address(in);
        }

        @Override
        public ContactInfo.Address[] newArray(int size) {
            return new ContactInfo.Address[size];
        }
    };
    private String city;
    private String country;
    private Date date;
    private boolean isChecked;

    protected AddressInfo(Parcel in) {
        city = in.readString();
        country = in.readString();
        date = new Date(in.readLong());
        isChecked = (in.readInt() != 0);
    }

    public AddressInfo(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public AddressInfo(String city, String country, Date date, boolean isChecked) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.isChecked = isChecked;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(city);
        dest.writeString(country);
        dest.writeLong(date.getTime());
        dest.writeInt(isChecked ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", Country='" + country + '\'' +
                ", Date='" + date + '\'' +
                ", Boolean='" + true + '\'' +
                '}';
    }

}

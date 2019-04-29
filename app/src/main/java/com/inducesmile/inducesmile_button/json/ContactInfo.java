package com.inducesmile.inducesmile_button.json;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class ContactInfo implements Parcelable {
    public static final Creator<ContactInfo> CREATOR = new Creator<ContactInfo>() {
        @Override
        public ContactInfo createFromParcel(Parcel in) {
            return new ContactInfo(in);
        }

        @Override
        public ContactInfo[] newArray(int size) {
            return new ContactInfo[size];
        }
    };
    private String name;
    private String surname;
    private int id;
    private Address address;

    ;

    public ContactInfo() {
    }

    protected ContactInfo(Parcel in) {
        name = in.readString();
        surname = in.readString();
        id = in.readInt();

        address = in.readParcelable(Address.class.getClassLoader());
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeInt(id);

        //Writing the nested class to parcel
        dest.writeParcelable(address, flags);
    }

    //Nested Class
    public static class Address implements Parcelable {


        public static final Creator<Address> CREATOR = new Creator<Address>() {
            @Override
            public Address createFromParcel(Parcel in) {
                return new Address(in);
            }

            @Override
            public Address[] newArray(int size) {
                return new Address[size];
            }
        };
        private String city;
        private String country;
        private Date date;

        protected Address(Parcel in) {
            city = in.readString();
            country = in.readString();
            date = new Date(in.readLong());
        }

        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        public Address(String city, String country, Date date) {
            this.city = city;
            this.country = country;
            this.date = date;
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
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", Country='" + country + '\'' +
                    ", Date='" + date + '\'' +
                    '}';
        }

    }
}

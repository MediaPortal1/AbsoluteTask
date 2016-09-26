package com.alexpoltavets.absolutewstask.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alex Poltavets on 26.09.2016.
 */

public class FacebookUser implements Parcelable {

    private String fullname;
    private String email;

    public FacebookUser(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    protected FacebookUser(Parcel in) {
        fullname = in.readString();
        email = in.readString();
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public static final Creator<FacebookUser> CREATOR = new Creator<FacebookUser>() {
        @Override
        public FacebookUser createFromParcel(Parcel in) {
            return new FacebookUser(in);
        }

        @Override
        public FacebookUser[] newArray(int size) {
            return new FacebookUser[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fullname);
        dest.writeString(email);
    }
}

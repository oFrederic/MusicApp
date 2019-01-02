package com.example.android.musicapp;

public class Song {
    private String mTitlename;
    private String mSingername;

    public Song (String titlename, String singername) {
        mTitlename = titlename;
        mSingername = singername;

    }

    public String getmTitlename() {
        return mTitlename;
    }

    public String getmSingername() {
        return mSingername;
    }
}

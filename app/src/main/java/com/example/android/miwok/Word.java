package com.example.android.miwok;

/**
 * Created by DD on 2016-11-07.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceID = mImageResourceID;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;

    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public boolean hasImager()
    {

        return  mImageResourceID!=NO_IMAGE_PROVIDED;
    }
}

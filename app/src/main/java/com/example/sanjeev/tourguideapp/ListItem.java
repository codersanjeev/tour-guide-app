package com.example.sanjeev.tourguideapp;

// Represents each list item in the list
// contains title and image resource ID
public class ListItem {

    private int mImageResourceId;
    private String mTitle;

    ListItem(int mImageRecourseId, String mTitle) {
        this.mImageResourceId = mImageRecourseId;
        this.mTitle = mTitle;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

}

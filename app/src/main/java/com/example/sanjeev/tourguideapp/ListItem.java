package com.example.sanjeev.tourguideapp;

import java.io.Serializable;

public class ListItem implements Serializable {
    private String name;
    private int imageID;

    public ListItem(){

    }

    public ListItem(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}

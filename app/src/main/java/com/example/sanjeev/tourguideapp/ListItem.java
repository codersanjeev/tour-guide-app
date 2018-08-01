package com.example.sanjeev.tourguideapp;

import java.io.Serializable;

public class ListItem implements Serializable {
    private String name;
    private int imageID;
    private String description;
    private String locationGeo;

    public String getLocationGeo() {
        return locationGeo;
    }

    public void setLocationGeo(String locationGeo) {
        this.locationGeo = locationGeo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListItem(){

    }

    public ListItem(String name, int imageID, String description, String locationGeo) {
        this.name = name;
        this.imageID = imageID;
        this.description = description;
        this.locationGeo = locationGeo;
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

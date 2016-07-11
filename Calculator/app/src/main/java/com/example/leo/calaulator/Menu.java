package com.example.leo.calaulator;

/**
 * Created by Leo on 2016/6/14.
 */
public class Menu {
    private  String name;
    private int imageID;

    public Menu(String name,int imageID){
        this.name = name;
        this.imageID = imageID;
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }
}
package com.example.student.sislerapplicationv3;

/**
 * Created by student on 17/10/2016.
 */
public class MainPageCards {
    private String name;
    private int thumbnail;

    public MainPageCards(String name, int thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }


    public int getThumbnail() {
        return thumbnail;
    }


}


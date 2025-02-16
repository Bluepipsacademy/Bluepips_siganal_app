package com.example.mymealmate.models;

public class HomeHorModel {
    int images;
    String name;

    public HomeHorModel(int images, String name) {
        this.images = images;
        this.name = name;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

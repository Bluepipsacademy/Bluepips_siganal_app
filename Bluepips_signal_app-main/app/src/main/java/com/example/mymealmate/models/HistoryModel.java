package com.example.mymealmate.models;

public class HistoryModel {
    int image;
    String name;

    String type;

    String discount;

    String description;

    public HistoryModel(int image, String name, String type, String discount, String description) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.discount = discount;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

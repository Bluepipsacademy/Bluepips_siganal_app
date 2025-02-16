package com.example.mymealmate.models;

public class HomeVerModel {
    int image;
    String name;
    String time;
    String more;
    String last;


    public HomeVerModel(int image, String name, String time, String more, String last) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.more = more;
        this.last = last;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}

package com.geektech.dz35;

public class Model {
    private int picture, phone;
    private String name;

    public Model(int picture, String name, int phone) {
        this.picture = picture;
        this.phone = phone;
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

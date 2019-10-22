package com.example.borgerkongapp;

public class MenuItem {

    private int menuitemID;
    private String menuitemName;
    private String menuitemDescription;
    private String menuitemPrice;
    private int imageDrawableId;
    private String kilojoules;

    public MenuItem(int menuitemID, String menuitemName, String menuitemDescription, String menuitemPrice, String kilojoules, int imageDrawableId) {
        this.menuitemID = menuitemID;
        this.menuitemName = menuitemName;
        this.menuitemDescription = menuitemDescription;
        this.menuitemPrice = menuitemPrice;
        this.kilojoules = kilojoules;
        this.imageDrawableId = imageDrawableId;
    }

    public int getMenuitemID() {
        return menuitemID;
    }

    public void setMenuitemID(int menuitemID) {
        this.menuitemID = menuitemID;
    }

    public String getMenuitemName() {
        return menuitemName;
    }

    public void setMenuitemName(String menuitemName) {
        this.menuitemName = menuitemName;
    }

    public String getMenuitemDescription() {
        return menuitemDescription;
    }

    public void setMenuitemDescription(String menuitemDescription) {
        this.menuitemDescription = menuitemDescription;
    }


    public String getMenuitemPrice() {
        return menuitemPrice;
    }

    public void setMenuitemPrice(String menuitemPrice) {
        this.menuitemPrice = menuitemPrice;
    }

    public String getKilojoules() {
        return kilojoules;
    }

    public void setKilojoules(String kilojoules) {
        this.kilojoules = kilojoules;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}

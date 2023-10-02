package com.example.demo.model;

public class Medicine {
    private int medicineld;
    private String medicineName;
    private float price;
    private int quantity;
    private String description;

    public Medicine() {
    }

    public Medicine(int medicineld, String medicineName, float price, int quantity, String description) {
        this.medicineld = medicineld;
        this.medicineName = medicineName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getMedicineld() {
        return medicineld;
    }

    public void setMedicineld(int medicineld) {
        this.medicineld = medicineld;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

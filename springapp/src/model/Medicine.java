package com.yourpackage.model;

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

}

package com.officialkatleen;

import java.util.ArrayList;

public class Receipt {

    private final ArrayList<String> foodItems;
    private final double totalPrice;

    public Receipt(ArrayList<String> foodItems, double totalPrice) {
        this.foodItems = foodItems;
        this.totalPrice = totalPrice;
    }

    public ArrayList<String> getFoodItems() {
        return foodItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }



}

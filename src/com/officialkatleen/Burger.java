package com.officialkatleen;

import java.util.ArrayList;

public class Burger {
    private String name;
    private String rollType;
    private String meat;
    private AdditionalItem additionalItem1;
    private AdditionalItem additionalItem2;
    private AdditionalItem additionalItem3;
    private AdditionalItem additionalItem4;
    private double price;

    public Burger(
            String rollType,
            String meat, AdditionalItem additionalItem1,
            AdditionalItem additionalItem2, AdditionalItem additionalItem3,
            AdditionalItem additionalItem4
    ) {

        this.name = "The Classic";
        this.rollType = rollType;
        this.meat = meat;
        this.additionalItem1 = additionalItem1;
        this.additionalItem2 = additionalItem2;
        this.additionalItem3 = additionalItem3;
        this.additionalItem4 = additionalItem4;
        this.price = 20.00;
    }

    public Burger(
            String name, String rollType,
            String meat, AdditionalItem additionalItem1,
            AdditionalItem additionalItem2, AdditionalItem additionalItem3,
            AdditionalItem additionalItem4, double price
    ) {

        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.additionalItem1 = additionalItem1;
        this.additionalItem2 = additionalItem2;
        this.additionalItem3 = additionalItem3;
        this.additionalItem4 = additionalItem4;
        this.price = price;
    }

    public Receipt startReceipt () {
        double originalPrice = this.price;
        ArrayList<String> foodItems = new ArrayList<>();

        System.out.println(this.name + " ...... $" + originalPrice);
        if (this.additionalItem1 != null){
            this.price += this.additionalItem1.getPrice();
            foodItems.add(this.additionalItem1.getName()+ " ...... $" + this.additionalItem1.getPrice());
        }
        if (this.additionalItem2 != null){
            this.price += this.additionalItem2.getPrice();
            foodItems.add(this.additionalItem2.getName()+ " ...... $" + this.additionalItem2.getPrice());
        }
        if (this.additionalItem3 != null){
            this.price += this.additionalItem3.getPrice();
            foodItems.add(this.additionalItem3.getName()+ " ...... $" + this.additionalItem3.getPrice());
        }
        if (this.additionalItem4 != null){
            this.price += this.additionalItem4.getPrice();
            foodItems.add(this.additionalItem4.getName()+ " ...... $" + this.additionalItem4.getPrice());
        }

        return new Receipt(foodItems, this.price);
    }

    public void makeReceipt () {
        Receipt receiptStart = startReceipt();
        printReceipt(new ArrayList<>(receiptStart.getFoodItems()), receiptStart.getTotalPrice());
    }

    public void printReceipt(ArrayList<String> receipt, double totalPrice){
        receipt.forEach(System.out::println);
        System.out.println("TOTAL ...... $" + totalPrice);
    }

}

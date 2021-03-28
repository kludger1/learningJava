package com.officialkatleen;


import java.util.ArrayList;

public class HealthyBurger extends Burger {
    private final AdditionalItem moreAdditionalItem1;
    private final AdditionalItem moreAdditionalItem2;

    public HealthyBurger(
            String meat, AdditionalItem additionalItem1,
            AdditionalItem additionalItem2, AdditionalItem additionalItem3,
            AdditionalItem additionalItem4,
            AdditionalItem moreAdditionalItem1, AdditionalItem moreAdditionalItem2) {
        super("Clean Mac", "Brown rye bread", meat, additionalItem1, additionalItem2, additionalItem3, additionalItem4, 40.00);
        this.moreAdditionalItem1 = moreAdditionalItem1;
        this.moreAdditionalItem2 = moreAdditionalItem2;

    }

    public void makeReceipt () {
        Receipt receiptStart = startReceipt();
        ArrayList<String> receipt = new ArrayList<>(receiptStart.getFoodItems());
        double totalPrice = receiptStart.getTotalPrice();

        if (this.moreAdditionalItem1 != null){
            totalPrice += this.moreAdditionalItem1.getPrice();
            receipt.add(this.moreAdditionalItem1.getName()+ " ...... $" + this.moreAdditionalItem1.getPrice());
        }
        if (this.moreAdditionalItem2 != null){
            totalPrice += this.moreAdditionalItem2.getPrice();
            receipt.add(this.moreAdditionalItem2.getName()+ " ...... $" + this.moreAdditionalItem2.getPrice());
        }

        printReceipt(receipt, totalPrice);
    }

}

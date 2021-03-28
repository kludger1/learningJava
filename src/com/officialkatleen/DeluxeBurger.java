package com.officialkatleen;

public class DeluxeBurger  extends Burger {

    public DeluxeBurger(String rollType, String meat) {
        super(
                "Lux B", rollType, meat,
                new AdditionalItem("Chip", 3.50),
                new AdditionalItem("Drink", 4.50),
                null, null, 50.00);

    }
}

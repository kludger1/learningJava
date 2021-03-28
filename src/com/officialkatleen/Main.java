package com.officialkatleen;

public class Main {

    public static void main(String[] args) {
        AdditionalItem lettuce = new AdditionalItem("Lettuce", 2.00);
        AdditionalItem tomato = new AdditionalItem("Tomato", 3.00);
        AdditionalItem blackOlive = new AdditionalItem("Black Olive", 2.00);
        AdditionalItem pickles = new AdditionalItem("Pickles", 4.00);
        AdditionalItem chip = new AdditionalItem("Chip", 3.50);
        AdditionalItem drink = new AdditionalItem("Drink", 4.50);

        Burger theClassic = new Burger(
                "Regular", "Chicken", lettuce,
                tomato, drink, null);

        HealthyBurger cleanMac = new HealthyBurger("Simple Burger", lettuce, tomato,
                blackOlive, pickles, chip, drink);



        DeluxeBurger luxB = new DeluxeBurger("Regular", "Chicken");

        theClassic.makeReceipt();
        System.out.println();
        cleanMac.makeReceipt();
        System.out.println();
        luxB.makeReceipt();
    }
}

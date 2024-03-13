package org.example;

public class Maindish extends Product {

    private boolean vegan;
    private int calories;

    private Type foodType;


    public Maindish(String name, double price,Type foodType, boolean vegan,int calories) {
        super(name, price);
        this.calories = calories;
        this.vegan = vegan;
        this.foodType = foodType;

    }

    enum Type {
        STEAK,
        SOUP,
        SALAD,
        PASTA,
        CREPES
    }
}

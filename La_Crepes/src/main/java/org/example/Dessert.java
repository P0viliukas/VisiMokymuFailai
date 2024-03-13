package org.example;

public class Dessert extends Product  {

    private boolean vegan;
    private int calories;
    private Type dessertType;
    private boolean dairyFree;


    public Dessert(String name, double price, Type dessertType, boolean vegan, boolean dairyFree , int calories) {
        super(name, price);
        this.calories = calories;
        this.vegan = vegan;
        this.dessertType = dessertType;
        this.dairyFree = dairyFree;
    }
    enum Type {
        ICECREAM,
        CAKE,
        PIE,
        FONDUE,
        SMOOTHIE

    }

}

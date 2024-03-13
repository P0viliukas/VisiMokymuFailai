package org.example;

public class Beverage extends Product {
    private boolean alcocholic;
    private int ml;
    private Type type;

    public Beverage(String name, double price,Type type,int ml, boolean alcocholic) {
        super(name, price);
        this.alcocholic = alcocholic;
        this.ml = ml;
        this.type = type;
    }
    enum Type {
        WATER,
        JUICE,
        SODA,
        BEER,
        WINE,
        VODKA
    }

}

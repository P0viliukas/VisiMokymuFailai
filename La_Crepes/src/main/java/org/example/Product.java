package org.example;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> ingredients = new ArrayList<>();
    private int quantity = 0;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public boolean decrease() {
        if (quantity == 0) {
            System.out.println("There is no food left" + name);
        } else
            quantity--;
            return true;


    }

    public void setQ(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + "EUR (" + quantity +")";
    }
}

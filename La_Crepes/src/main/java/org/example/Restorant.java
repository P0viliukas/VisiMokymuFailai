package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restorant {
    private String title;
    private List<Product> menu = new ArrayList<>();

    public void addProduct(Product product){
        menu.add(product);
    }
    public void order(Order order){
        order.getItem().removeIf(p -> !p.decrease());

    }

    public Restorant(String title) {
        this.title = title;
    }
    public void printMenu() {
        System.out.println("----------------------");
        System.out.println(title);
        for(Product p : menu){
            System.out.println(p);
        System.out.println("----------------------");
        }

    }
}

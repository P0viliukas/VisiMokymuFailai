package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> item = new ArrayList<>();
    public void addProduct(Product product){
        item.add(product);
    }
    public double getPrice(){
        double sum = 0;
        for(Product p: item){
           sum += p.getPrice();
        }
        return sum;
    }

    public List<Product> getItem() {
        return item;
    }
}

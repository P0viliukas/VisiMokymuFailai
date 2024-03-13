package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Restorant restorant = new Restorant("le Crepes");
        Dessert pancake = new Dessert("Blynai",7.43, Dessert.Type.CAKE,true, true, 500);
        Maindish sashlyk = new Maindish("Sashlykas", 17.98, Maindish.Type.STEAK, true, 8000);
        Beverage martini = new Beverage("Martinis", 5.98, Beverage.Type.VODKA, 500, true);

        pancake.setQ(20);
        sashlyk.setQ(255);
        martini.setQ(100);





        restorant.addProduct(pancake);
        restorant.addProduct(sashlyk);
        restorant.addProduct(martini);

        restorant.printMenu();

        Order order = new Order();
        order.addProduct(pancake);
        order.addProduct(sashlyk);
        order.addProduct(martini);

        System.out.println(order.getPrice());
        restorant.order(order);
        restorant.printMenu();
    }

}

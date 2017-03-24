package ch.ex19.include.store;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Created by V1 on 17.03.2017.
 */
public class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) { //
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return id +" : " + description + ", price: " + price;
    }

    public static IGenerator<Product> generator() {
        return new IGenerator<Product>() {
            private Random rnd = new Random();
            @Override
            public Product next() {
                return new Product(rnd.nextInt(1000),"Test",
                        Math.round(rnd.nextDouble()*1000.0)+0.99);
            }
        };
    }

}

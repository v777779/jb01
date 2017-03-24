package ch15.ex19.include.store;

import lib.utils.Generators;

import java.util.ArrayList;

/**
 * Created by V1 on 17.03.2017.
 */
public class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Generators.fill(this,Product.generator(), nProducts);  // конструктор генерит список
    }
}

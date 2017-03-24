package ch13.ex04.access;

import java.util.Formatter;

/**
 * Created by V1 on 05-Mar-17.
 */
public class Receipt {
    private final int ITEM_WIDTH = 15;
    private final int QTY_WIDTH = 5;
    private final int PRICE_WIDTH = 15;

    private final String F1 = "%-"+ITEM_WIDTH+"s %"+QTY_WIDTH+"s %"+PRICE_WIDTH+"s\n";
    private final String F2 = "%-"+ITEM_WIDTH+"."+ITEM_WIDTH+"s %"+QTY_WIDTH+"s %"+PRICE_WIDTH+".2f\n";
    private final String F3 = "%-"+ITEM_WIDTH+"s %"+QTY_WIDTH+"s %"+PRICE_WIDTH+".2f\n";


    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format(F1,"Item","Qty","Price");
        f.format(F1,"----","---","-----");
    }

    public void print(String name, int qty, double price) {
        f.format(F2,name,qty,price);   // внимание как обрезать строковый вывод
        total += price;
    }

    public void printTotal() {
        f.format(F3,"Tax","",total*0.06);
        f.format(F1,"","","-----");
        f.format(F3,"Total","",total*1.06);
    }

}

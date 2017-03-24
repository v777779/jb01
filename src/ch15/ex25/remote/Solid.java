package ch15.ex25.remote;

import java.awt.*;

/**
 * Created by V1 on 18.03.2017.
 */
public class Solid<T extends Dimension & IColor & IWeight> {
  T item; // доступны методы и поля класса и двуха интерфейсов
    public Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

// shell methods
//IColor
    Color getColor() {
        System.out.print("Solid.getColor > ");;
        return item.getColor();
    }
//Dimension methods
    int getItemX() {
        System.out.print("Solid.getItemX > ");;
        return item.getX();
    }

    int getItemY() {
        System.out.print("Solid.getItemY > ");;
        return item.getY();
    }

    int getItemZ() {
        System.out.print("Solid.getItemZ > ");;
        return item.getZ();
    }

    int getX() {
        System.out.print("Solid.getX > ");;
        return item.x;
    }

    int getY() {
        System.out.print("Solid.getY > ");;
        return item.y;
    }

    int getZ() {
        System.out.print("Solid.getZ > ");;
        return item.z;
    }


// IWeight
    int getWeight() {
        System.out.print("Solid.getWeight > ");;
        return item.getWeight();
    }
}

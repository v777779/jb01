package ch09.ex12;

import ch09.ex12.access.GenClass;
import ch09.ex12.access.Hero;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("\nExercise 12  Interface Check\n");
        Hero hero = new Hero(); // многоинтерфейсный объект

        GenClass.iFight(hero); // разные интерфейсы к одному объекту
        GenClass.iSweem(hero); // разные интерфейсы к одному объекту
        GenClass.iFly(hero); // разные интерфейсы к одному объекту
        GenClass.iClimb(hero); // разные интерфейсы к одному объекту
    }
}

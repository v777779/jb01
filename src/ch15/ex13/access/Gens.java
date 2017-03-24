package ch.ex13.access;


import lib.utils.IGenerator;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Created by V1 on 16.03.2017.
 */
public class Gens {
    public static <T> Collection <T> fill(Collection<T> col, IGenerator<T> gen, int n) {
        System.out.println("Basic version:");
        for (int i = 0; i < n; i++) {
            col.add(gen.next()); // функция реализация класса интерфейса генератора
        }
        return col; // выгрузить заполненную Collection
    }

    public static <T> List <T> fill(List<T> col, IGenerator<T> gen, int n) {
        System.out.println("List version:");

        for (int i = 0; i < n; i++) {
            col.add(gen.next()); // функция реализация класса интерфейса генератора
        }
        return col; // выгрузить заполненную Collection
    }
    public static <T> Set <T> fill(Set<T> col, IGenerator<T> gen, int n) {
        System.out.println("Set version:");
        for (int i = 0; i < n; i++) {
            col.add(gen.next()); // функция реализация класса интерфейса генератора
        }
        return col; // выгрузить заполненную Collection
    }
    public static <T> Queue <T> fill(Queue<T> col, IGenerator<T> gen, int n) {
        System.out.println("Queue version:");

        for (int i = 0; i < n; i++) {
            col.add(gen.next()); // функция реализация класса интерфейса генератора
        }
        return col; // выгрузить заполненную Collection
    }


}

package ch19.ex12.codeb;

import lib.utils.Enums;
import lib.utils.ICompetitor;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class RoShambo {
    public static <T extends ICompetitor<T>> void match (T a, T b) {     // под интерфейс подточили
        System.out.printf("%-10s vs  %-10s : %s\n", a, b, a.compete(b));  // RoShamBo2<> class будет здесь
    }

    public static <T extends Enum<T> & ICompetitor<T>> void play(Class<T> rsbClass, int size) {
        for (int i = 0; i < size; i++) {  // extends Enum<T> for Enums.random() , ICompetitor<> for match
            match(Enums.random(rsbClass),Enums.random(rsbClass));
        }
    }


}

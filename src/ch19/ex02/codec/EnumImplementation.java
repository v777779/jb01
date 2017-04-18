package ch19.ex02.codec;

import lib.utils.IGenerator;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class EnumImplementation {
    private static <T> void printNext(IGenerator<T> gen) {
        System.out.print(gen.next()+", ");
    }

    public static void check() {
        CartoonCharacter cc = CartoonCharacter.BOB;  // текущий компонент может вызвать next()
        for (int i = 0; i < 10; i++) {
            printNext(cc.next());
        }
        System.out.println();
    }

}

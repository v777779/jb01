package ch19.ex10.exercise.vm;

import java.util.Random;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public enum Input {
    // конструктор  Input(int value)
    NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
    TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
    // конструктор  Input()
    ABORT_TRANSACTION {
        public int amount() {
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP {
        public int amount() {
            throw new RuntimeException("SHUT_DOWN.amount()");
        }

    };

    static Random rnd = new Random();
    int value;

    Input() {
    }

    Input(int value) {
        this.value = value;
    }

    int amount() {
        return value;
    }

    public static Input randomSelection() {
        return values()[rnd.nextInt(values().length - 1)]; // выдать все Enum кроме STOP
    }

}

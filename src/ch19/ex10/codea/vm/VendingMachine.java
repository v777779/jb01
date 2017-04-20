package ch19.ex10.codea.vm;

import lib.utils.IGenerator;

import static ch19.ex10.codea.vm.VendingMachine.State.TERMINAL;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class VendingMachine {
    private static State state = State.RESTING;
    private static int amount = 0;
    private static Input selection = null;

    enum StateDuration {TRANSIENT} // перечисление с одним состоянием

    enum State {
        RESTING {
            @Override
            void next(Input input) {
                switch (Category.categorize(input)) {
                    case MONEY:
                        amount += input.amount(); // вытаскиваем деньги из объекта
                        state = ADDING_MONEY; // переходим в следующее состояние
                        break;
                    case SHUT_DOWN:
                        state = TERMINAL;
                        break;
                    default:
                        break;
                }
            }
        },
        ADDING_MONEY {
            @Override
            void next(Input input) {
                switch (Category.categorize(input)) {
                    case MONEY:
                        amount += input.amount();   // сидим здесь пока получаем денег
                        break;
                    case ITEM_SELECTION:
                        selection = input;          // собственно выбранный товар
                        if (amount < selection.amount()) { // денег и цена сравнение{
                            System.out.println("Insufficient money for:" + selection);
                        } else {
                            state = DISPENSING; // выдача товара
                        }
                        break;
                    case QUIT_TRANSACTION:
                        state = GIVING_CHANGE; // если надо денег вернуть
                        break;
                    case SHUT_DOWN:
                        state = TERMINAL;
                        break;
                    default:
                        break;
                }
            }
        },
        DISPENSING(StateDuration.TRANSIENT) {
            @Override
            void next() {
                System.out.println("here is your " + selection);
                amount -= selection.amount();
                state = GIVING_CHANGE;
            }
        },
        GIVING_CHANGE(StateDuration.TRANSIENT) {
            @Override
            void next() {
                if (amount > 0) {
                    System.out.println("Your change:" + amount);
                    amount = 0;
                }
                state = RESTING;
            }
        },
        TERMINAL {
            void output() {                     // метод переопределен
                System.out.println("Halted");
            }
        };
        private boolean isTransient = false;  // inside state

        State() {
        }

        State(StateDuration tran) {  // если поле есть, значит true
            isTransient = true;
        }

        void next(Input input) {
            throw new RuntimeException("next() for non-transient states");
        }

        void next() {
            throw new RuntimeException("next() for transient states");
        }

        void output() {
            System.out.println(amount);
        }
    }

    static void run(IGenerator<Input> gen) {
        while (state != TERMINAL) {
            Input in = gen.next();
            state.next(in);
            while (state.isTransient) {  // пока state переходное вызывать state.next
                state.next();
            }
            state.output();
        }
    }

    public static void check(String fileName) {
        IGenerator<Input> gen = new RandomInputGenerator(); // объект с одним методом, который выдает Inputs
        gen = new FileInputGenerator(fileName);
         run(gen);  // случайно генерятся любые события
    }
}

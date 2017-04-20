package ch19.ex10.exercise.vm;

import lib.utils.IGenerator;
import java.util.EnumMap;
import static ch19.ex10.exercise.vm.VendingMachine.State.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class VendingMachine {
    private static State state = RESTING;
    private static int amount = 0;
    private static Input selection = null;

    enum StateDuration {TRANSIENT} // перечисление с одним состоянием

    enum State {
        RESTING, ADDING_MONEY, DISPENSING(StateDuration.TRANSIENT),
        GIVING_CHANGE(StateDuration.TRANSIENT), TERMINAL;

        private boolean isTransient = false;  // inside state
        State() {
        }

        State(StateDuration tran) {  // если поле есть, значит true
            isTransient = true;
        }
    }

    interface IVMAction {
        void next(Input input);
        void next();
        void output();
    }

    private static EnumMap<State, IVMAction> eMap = new EnumMap<State, IVMAction>(State.class);

    static {
        eMap.put(RESTING, new IVMAction() {
            @Override
            public void next() {
            }
            @Override
            public void output() {
                System.out.println(amount);
            }
            @Override
            public void next(Input input) {
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
        });
        eMap.put(ADDING_MONEY, new IVMAction() {
            @Override
            public void next() {
            }

            @Override
            public void output() {
                System.out.println(amount);
            }

            @Override
            public void next(Input input) {
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
        });
        eMap.put(DISPENSING, new IVMAction() {
            @Override
            public void next() {
                System.out.println("here is your " + selection);
                amount -= selection.amount();
                state = GIVING_CHANGE;
            }

            @Override
            public void next(Input input) {
            }

            @Override
            public void output() {
                System.out.println(amount);
            }
        });
        eMap.put(GIVING_CHANGE, new IVMAction() {
            @Override
            public void next() {
                if (amount > 0) {
                    System.out.println("Your change:" + amount);
                    amount = 0;
                }
                state = RESTING;
            }

            @Override
            public void next(Input input) {
            }

            @Override
            public void output() {
                System.out.println(amount);
            }
        });

        eMap.put(TERMINAL, new IVMAction() {
            @Override
            public void next(Input input) {
            }

            @Override
            public void next() {
            }

            public void output() {                     // метод переопределен
                System.out.println("Halted");
            }
        });
    }


    static void run(IGenerator<Input> gen) {
        while (state != TERMINAL) {
            Input in = gen.next();
            eMap.get(state).next(in);
            while (state.isTransient) {  // пока state переходное вызывать state.next
                eMap.get(state).next();  // надо обновлять постоянно
            }
            eMap.get(state).output();   // тоже самое надо обновлять каждый раз
        }
    }

    public static void check(String fileName) {
        IGenerator<Input> gen = new RandomInputGenerator(); // объект с одним методом, который выдает Inputs
        gen = new FileInputGenerator(fileName);
        run(gen);  // случайно генерятся любые события
    }
}

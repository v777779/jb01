package ch19.ex08.coded;

import lib.utils.ICommand;

import java.util.EnumSet;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class CarWash {
    public enum Cycle implements ICommand {
        UNDERBODY {
            @Override
            public void action() {
                System.out.println("Spraying the underbody");
            }
        },
        WHEELWASH {
            @Override
            public void action() {
                System.out.println("Washing the wheels");
            }
        },
        PREWASH {
            @Override
            public void action() {
                System.out.println("Loosening the dirt");
            }
        },
        BASIC {
            @Override
            public void action() {
                System.out.println("The basic wash");
            }
        },
        HOTWAX {
            @Override
            public void action() {
                System.out.println("Applying hot wax");
            }
        },
        RINSE {
            @Override
            public void action() {
                System.out.println("Rinsing");
            }
        },
        BLOWDRY {
            @Override
            public void action() {
                System.out.println("Blowing dry");
            }
        }
    }

    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.RINSE);  // все таки Set дубликаты отсекает
    public void add(Cycle cycle) {
        cycles.add(cycle);
    }
    public void washCar() {
        for (Cycle cycle : cycles) {
            cycle.action();
        }
    }

    @Override
    public String toString() {
        return cycles.toString();
    }
}

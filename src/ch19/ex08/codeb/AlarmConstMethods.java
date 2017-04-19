package ch19.ex08.codeb;

import ch19.ex08.codea.ICommand;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public enum AlarmConstMethods implements ICommand {
    KITCHEN{
        @Override
        public void action() {
            System.out.println("Kitchen Light On");
        }
    },
    BATHROOM {
        @Override
        public void action() {
            System.out.println("Bathroom Water On");
        }
    },
    UTILITY {
        @Override
        public void action() {
            System.out.println("Tools Locked Off");
        }
    };

    public static void check() {  // это статический метод общий для всех
        for (AlarmConstMethods constMethod : values()) {
            System.out.println(constMethod.name() + " : ");
            constMethod.action();
        }
    }
}

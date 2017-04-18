package ch19.ex03.coded;

import lib.utils.Enums;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum SecurityCategory {
    STOCK(Security.Stock.class),   // объекты SecurityCategory
    BOND(Security.Bond.class);     // аргументы класса Security Interface

    private interface Security {
        enum Stock implements Security {
            SHORT, LONG, MARGIN;
        }
        enum Bond implements Security {
            MUNICIPAL, JUNK;
        }
    }

    Security[] securities;          // заполняется при обращении к объектам

    SecurityCategory(Class<? extends Security> kind) {
        securities = kind.getEnumConstants();
    }

    public Security randomSelection() {
        return Enums.random(securities);  // выбрать случайное значение
    }

    public static void check() {

        System.out.println("Enum and Interface Compact:");
        for (int i = 0; i <10 ; i++) {
            SecurityCategory category = Enums.random(SecurityCategory.class);  // выбрать из двух значений BOND:STOCK
            System.out.println(category+" : "+category.randomSelection()); // выбрать из 3:2 значений
        }
    }
}

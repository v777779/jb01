package ch19.ex10.exercise.vm;

import java.util.EnumMap;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public enum Category {
    MONEY(Input.NICKEL, Input.DIME, Input.QUARTER, Input.DOLLAR),
    ITEM_SELECTION(Input.TOOTHPASTE, Input.CHIPS, Input.SODA, Input.SOAP),
    QUIT_TRANSACTION(Input.ABORT_TRANSACTION),
    SHUT_DOWN(Input.STOP);
    private Input[] types;  // для каждой из строк выше

    Category(Input... types) {
        this.types = types;
    }
    private static EnumMap<Input, Category> categories = new EnumMap(Input.class);

    static {
//        for (Category category : values()) { такое не работает из static context
        for (Category category : Category.class.getEnumConstants()) {
            for (Input type : category.types) {
                categories.put(type,category);
            }
        }
    }

    public static Category categorize(Input input) { // получить категорию продукта
        return categories.get(input);
    }

}

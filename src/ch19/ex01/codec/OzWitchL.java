package ch19.ex01.codec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum OzWitchL {
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the Nprth"),
    EAST("Wicked Witch of the East, wearer of the Ruby " +
            "Slippers, cruched by Dorothy's house"),
    SOUTH("Good by inference, but missing"),
// тоже работает работает любая комбинация аргументов
    WEST_SOUTH(12),
    NORTH_WEST(15),
    EAST_SOUTH("East winds transformations",12),
    EAST_WEST("Combine factors of influence",15) ;

    private String description;// без конструктора выдает ошибку
    private int value;

    OzWitchL(String description, int value) {
        this.description = description;
        this.value = value;
    }

    OzWitchL(int value) {   // ВНИМАНИЕ конструктор по умолчанию private
        this.value = value;
    }

    OzWitchL(String description) {   // ВНИМАНИЕ конструктор по умолчанию private
        this.description = description;
    }


    public String getDescription() {
        return description+"."+value;
    }

    @Override
    public String toString() {
        if (description != null) {
            return name()+" ["+description.toLowerCase() + ":" + value+"]";
        }
        return name()+"["+description + ":" + value+"]";
    }
}

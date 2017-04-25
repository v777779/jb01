package ch18.ex30.codec;

import java.io.Serializable;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Animal implements Serializable {
    private String name;
    private House house;

    public Animal() {
    }

    public Animal(String name, House house) {
        this.name = name;
        this.house = house;
    }

    @Override
    public String toString() {
        return name + "["+ super.toString() +  "], " +
               house + "\n";
    }
}

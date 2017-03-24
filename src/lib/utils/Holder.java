package lib.utils;

/**
 * Created by V1 on 20.03.2017.
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return value.equals(o);
    }

    public String getName() {
        return value.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Holder{" +
                value +
                '}';
    }
}

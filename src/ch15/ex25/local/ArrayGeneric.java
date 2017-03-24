package ch.ex25.local;

/**
 * Created by V1 on 18.03.2017.
 */
public class ArrayGeneric<T> {
private Generic<T>[] array;

    public ArrayGeneric(int size) {
         array = new Generic[size];
    }

    public void set(int index, T value) {
        array[index] = new Generic<>(value);
    }
    public T get(int index) {
        return array[index].value; // out of Generic{}
    }

}

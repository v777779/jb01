package ch.ex25.include;

/**
 * Created by V1 on 18.03.2017.
 */
public class GenericArray<T> {
    private T[] array = (T[])new Object[10];

    public GenericArray(int size) {
        this.array = (T[])new Object[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {  // выдаем ссылку на массив внутри класса
     return array;
    }

}

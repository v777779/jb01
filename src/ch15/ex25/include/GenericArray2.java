package ch15.ex25.include;

/**
 * Created by V1 on 18.03.2017.
 */
public class GenericArray2<T> {
    private Object[] array = new Object[10];  // рекомендованная стратегия

    public GenericArray2(int size) {
        this.array = new Object[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public Object[] rep() {  // выдаем ссылку на массив внутри класса
     return array;
    }

}

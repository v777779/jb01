package ch.ex33.access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class FixedSizeStack<T> {
    private int index = 0;
    private int size;
    private List<T> storage = new ArrayList<T>();

    public FixedSizeStack(int size) {
        this.size = size;
    }

    public void push(T item) {
        if (index >= size) {  // не работает если индекс за пределами size
            return;
        }
        index++;
        storage.add(item);
    }

    public T pop() {
        if (index > 0) {
            index--;
        }
        return storage.get(index);  // неконтролируемое приведение типа
    }


    public static void stackTest() {
        System.out.println("Fixed Size Stack ArrayList<T>");
        FixedSizeStack<String> stack = new FixedSizeStack<>(10);
        for (String s : "This is the conversation for pushing to fixed size stack words from string".split(" ")) {
            stack.push(s);
        }
        System.out.print("stack: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}

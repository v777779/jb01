package ch.ex33.access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class FixedSizeStackEx<T> {
    private int index = 0;
    private int size;
    private List<T> storage = new ArrayList<T>();

    public FixedSizeStackEx(int size) {
        this.size = size;
    }

    public void push(T item) {
        if (index < size) {  // не работает если индекс за пределами size
            index++;
            storage.add(item);
        } else {
            throw new RuntimeException("Stack is Overflow");
        }

    }

    public T pop() {
        if (index > 0) {
            index--;
            return storage.get(index);  // неконтролируемое приведение типа
        }else{
            throw new RuntimeException("Stack is Empty");
        }
    }


    public static void stackTestOverflow() {
        System.out.println("Fixed Size Stack ArrayList<T> with Exception");
        FixedSizeStackEx<String> stack = new FixedSizeStackEx<>(10);
        for (String s : "This is the conversation for pushing to fixed size stack words from string".split(" ")) {
            stack.push(s);
        }
        System.out.print("stack: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void stackTestEmpty() {
        System.out.println("Fixed Size Stack ArrayList<T> with Exception");
        FixedSizeStackEx<String> stack = new FixedSizeStackEx<>(10);
        for (String s : "This is the conversation for pushing to fixed size stack".split(" ")) {
            stack.push(s);
        }
        System.out.print("stack: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}

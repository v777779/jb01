package ch15.ex32.local;

/**
 * Created by V1 on 21.03.2017.
 */
public class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    public T pop() {
        return (T) storage[--index];  // неконтролируемое приведение типа
    }


    public static void stackTest() {
        System.out.println("Fixed Size Stack<T>");
        FixedSizeStack<String> stack = new FixedSizeStack<>(10);
        for (String s : "This is the conversation for pushing to fixed size stack".split(" ")) {
            stack.push(s);
        }
        System.out.print("stack: ");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
}

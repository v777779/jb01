package ch11.ex15.local;

import java.util.Stack;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nStack  Check\n");

        SimpleStack<Ball> stack = new SimpleStack();
        stack.push(new Ball());
        stack.push(new Ball());
        stack.push(new Ball());
        stack.push(new Ball());

        System.out.println("Stack<Ball> content:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        SimpleStack<String> stack2 = new SimpleStack();
        String[] strings = new String("This is String stack not Ball").split(" ");
        for (String s : strings) {
            stack2.push(s);
        }

        System.out.println("Stack<String> content:");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();

        Stack<String> stack3 = new Stack();
        String[] strs = new String("This is String stack not Ball").split(" ");
        for (String s : strings) {
            stack3.push(s);
        }

        System.out.println("\nStack Standard Java Class\n");

        System.out.println("Stack<String> content:");
        while (!stack3.isEmpty()) {
            System.out.print(stack3.pop() + " ");
        }
        System.out.println();


    }
}

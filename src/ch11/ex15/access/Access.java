package ch11.ex15.access;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 Stack Check\n");
        String string = new String("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();


        for (char aChar : string.toCharArray()) {  // крутим массив
            stack.push(aChar);                     // залить в один стек
        }

        while (!stack.empty()) {  // перелить в другой стек
            stack2.push(stack.pop());
        }

        System.out.println("The Result of String from Stack:");
        while (!stack2.isEmpty()) {         // крутим стек 2
            char aChar = stack2.pop();      // извлекли первый символ автоматическая распаковка
            if (aChar == '+') {
                stack.push(stack2.pop());  //второй символ извлекаем после + и в другой стек
            }
            if (aChar == '-') {
                if (stack.isEmpty()) {
                    System.out.println("***stack is empty***");
                } else {
                    System.out.print(stack.pop()); // вывести символ
                }
            }
        }
        System.out.println();


    }
}

package ch17.ex42.unit;

import lib.utils.SimpleStack;

import java.time.Month;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by V1 on 04-Apr-17.
 */
public class Stacks {
    public static void check() {

        System.out.println("\n\nStack:");
        Stack<String> stack = new Stack();
        for (Month month : Month.values()) {  // перебирает значение месяцев
            stack.push(month.toString());
        }
        System.out.println("stack      :"+stack);

        System.out.println("Stack as Vector:");
        stack.add("the last line");
        System.out.println("stack      :"+stack);
        System.out.println("element(5) :"+stack.elementAt(5));
        System.out.print("stack pop():");

        while (!stack.empty()) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();


        System.out.println("\nLinkedList Stack:");
        LinkedList<String> listStack = new LinkedList<>();
        for (Month month : Month.values()) {  // перебирает значение месяцев
            listStack.addFirst(month.toString());
        }
        System.out.println("listStack      :"+listStack);
        System.out.print("listStack pop():");
        while (!listStack.isEmpty()) {
            System.out.print(listStack.removeFirst()+" ");
        }
        System.out.println();

        System.out.println("\nLinkedList as Stack Class:");
        listStack = new LinkedList<>();
        for (Month month : Month.values()) {  // перебирает значение месяцев
            listStack.addLast(month.toString());
        }
        System.out.println("listStack      :"+listStack);
        System.out.print("listStack pop():");
        while (!listStack.isEmpty()) {
            System.out.print(listStack.removeLast()+" ");
        }
        System.out.println();



        System.out.println("\nCustom Stack based on LinkedLink:");
        SimpleStack<String> simpleStack = new SimpleStack<>();
        for (Month month : Month.values()) {  // перебирает значение месяцев
            simpleStack.push(month.toString());
        }
        System.out.println("simpleStack      :"+simpleStack);

        System.out.print("simpleStack pop():");
        while (!simpleStack.isEmpty()) {
            System.out.print(simpleStack.pop()+" ");
        }
        System.out.println();



    }
}

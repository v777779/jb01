package ch20.ex06.exercise;

import lib.units.atunit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LinkedListTest {
    LinkedList<String> testObject = new LinkedList<>();

    @Test
    void _initialization() {
        assert testObject.isEmpty() : "object is not empty";              // проверка объекта assert
    }

    @Test
    void _contains() {
        testObject.add("one");
        assert testObject.contains("one") : "object does not contain";    // проверка объекта assert
    }

    @Test
    void _get() {
        testObject.add("one");
        testObject.add("two");
        assert testObject.get(1).equals("two");
    }

    @Test
    void _add() {
        testObject.add("one");
        testObject.add("two");
        assert testObject.containsAll(Arrays.asList("one", "two")) : "no data in list";
    }

    @Test
    void _removeLast() {
        testObject.add("one");
        testObject.add("two");
        testObject.removeLast();
        assert !testObject.contains("two");
    }

    @Test
    void _getLast() {
        testObject.add("one");
        testObject.add("two");
        assert testObject.getLast().equals("two");
    }

    @Test
    void _addLast() {
        testObject.add("one");
        testObject.add("two");
        testObject.addLast("three");
        assert testObject.getLast().equals("three");
    }

    @Test
    void _addFirst() {
        testObject.add("one");
        testObject.add("two");
        testObject.addFirst("zero");
        assert testObject.get(0).equals("zero");
    }

    @Test
    void _removeFirst() {
        testObject.add("one");
        testObject.add("two");
        testObject.addFirst("zero");
        assert testObject.removeFirst().equals("zero");
    }

    @Test
    void _remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty() : "object did not remove";            // проверка объекта assert
    }

}

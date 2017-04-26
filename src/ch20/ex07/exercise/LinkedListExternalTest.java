package ch20.ex07.exercise;

import lib.units.atunit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LinkedListExternalTest extends LinkedList<String> {

    @Test
    void _initialization() {
        assert isEmpty() : "object is not empty";              // проверка объекта assert
    }

    @Test
    void _contains() {
        add("one");
        assert contains("one") : "object does not contain";    // проверка объекта assert
    }

    @Test
    void _get() {
        add("one");
        add("two");
        assert get(1).equals("two");
    }

    @Test
    void _add() {
        add("one");
        add("two");
        assert containsAll(Arrays.asList("one", "two")) : "no data in list";
    }

    @Test
    void _removeLast() {
        add("one");
        add("two");
        removeLast();
        assert !contains("two");
    }

    @Test
    void _getLast() {
        add("one");
        add("two");
        assert getLast().equals("two");
    }

    @Test
    void _addLast() {
        add("one");
        add("two");
        addLast("three");
        assert getLast().equals("three");
    }

    @Test
    void _addFirst() {
        add("one");
        add("two");
        addFirst("zero");
        assert get(0).equals("zero");
    }

    @Test
    void _removeFirst() {
        add("one");
        add("two");
        addFirst("zero");
        assert removeFirst().equals("zero");
    }

    @Test
    void _remove() {
        add("one");
        remove("one");
        assert isEmpty() : "object did not remove";            // проверка объекта assert
    }

}

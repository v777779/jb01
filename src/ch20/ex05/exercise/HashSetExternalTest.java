package ch20.ex05.exercise;

import lib.units.atunit.Test;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HashSetExternalTest extends HashSetTest {

    @Test void _initialization() {
        assert testObject.isEmpty():"object is not empty";              // проверка объекта assert
        testObject.add("two");
    }
    @Test void _contains() {
        testObject.add("one");
        assert testObject.contains("one"):"object does not contain";    // проверка объекта assert
    }

    @Test void _remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty():"object did not remove";            // проверка объекта assert

    }

}

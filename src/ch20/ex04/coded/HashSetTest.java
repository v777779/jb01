package ch20.ex04.coded;

import lib.units.atunit.Test;
import java.util.HashSet;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HashSetTest {
    HashSet<String> testObject = new HashSet<>();

    @Test void initialization() {
        assert testObject.isEmpty():"object is not empty";              // проверка объекта assert
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

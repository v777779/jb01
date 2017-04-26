package ch20.ex08.coded;

import lib.units.atunit.Test;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class StackLStringTest<String> extends StackL {

    @Test
    void _push() {
        push("one");
        assert top().equals("one"); // проверяем функцию
        push("two");
        assert top().equals("two"); // проверяем функцию
    }

    @Test
    void _pop() {
        push("one");
        push("two");
        assert pop().equals("two"); // проверяем функцию
        assert pop().equals("one"); // проверяем функцию
    }


    @Test
    void _top() {
        push("A");
        push("B");
        assert top().equals("B"); // проверяем функцию
        assert top().equals("B"); // проверяем функцию
    }

    @Test
    void _list() {
        push("one");
        push("two");
        System.out.println(get().toString());
    }


}

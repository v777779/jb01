package ch20.ex09.exercise;

import lib.units.atunit.Test;
import lib.units.atunit.TestObjectCreate;

import java.util.HashMap;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HashMapTest extends HashMap<String, Integer> {

    @TestObjectCreate
    public static HashMapTest create() {
        HashMapTest hMapTest = new HashMapTest();

        hMapTest.put("One",12);
        hMapTest.put("Let",75);
        hMapTest.put("This",1);
        hMapTest.put("eofG",125);
        hMapTest.put("derive",7);

        return hMapTest;
    }

    @Test
    boolean _put() {
        int size = size();
        put("Auto",1001);
        return get("Auto").equals(1001) && size()==size+1;
    }

    @Test
    boolean _get() {
        return get("eofG").equals(125);
    }

    @Test
    boolean _empty() {
        this.clear();
        return isEmpty();
    }

    @Test
    boolean _containsKey() {

        return containsKey("This");
    }

    @Test
    boolean _containsValue() {
        return containsValue(7);
    }


}

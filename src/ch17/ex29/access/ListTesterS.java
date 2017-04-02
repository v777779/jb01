package ch17.ex29.access;

import lib.maps.Countries;
import lib.tests.Test;
import lib.tests.Tester;

import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListTesterS extends Tester<List<String>> {

    public ListTesterS(List<String> container, List<Test<List<String>>> tests) {
        super(container, tests);
    }

    @Override
    protected List<String> initialize(int size) {   // переопределить container
        container.clear();
        while (size > 50) {
            container.addAll(Countries.names(50).subList(25,45)); // создать список со значениями
            size -= 50;
        }
        container.addAll(Countries.names(size)); // создать список со значениями

        return container;
    }

    // Override не работает т.к. это статический метод класса
    public static void run(List<String> list, List<Test<List<String>>> tests) {
        System.out.println("run of ListTester <String>");
        new ListTesterS(list, tests).timedTests();
    }


}

package ch17.ex01.include;

import lib.utils.IGenerator;

/**
 * Created by V1 on 3/27/2017.
 */
public class GenGov implements IGenerator<String> {
    private String[] strings = ("strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government").split(" "); // массив строк
    private int index;
    @Override
    public String next() {
        return strings[index++ % strings.length];  // не превышая размер массива
    }
}

package ch15.ex36.local;

import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class Processor1 implements IProcessor<String, Failure1> {  // T=String E=Failure1
    static int count = 3;
    @Override
    public void process(List<String> list) throws Failure1 {
        if (count-- > 1) {
            list.add("Help!");
        } else {
            list.add("Ho!");
        }
        if (count < 0) {
            throw new Failure1(); // три раза отработали
        }
    }
}

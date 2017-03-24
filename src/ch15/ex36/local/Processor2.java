package ch15.ex36.local;

import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class Processor2 implements IProcessor<Integer, Failure2> {  // T=String E=Failure1
    static int count = 2;
    @Override
    public void process(List<Integer> list) throws Failure2 {
        if (count-- > 1) {
            list.add(15);
        } else {
            list.add(10);
        }
        if (count < 0) {
            throw new Failure2(); // три раза отработали
        }
    }
}

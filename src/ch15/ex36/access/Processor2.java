package ch.ex36.access;

import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class Processor2 implements IProcessor<Integer, Failure2, Failure22> {  // T=String E=Failure1
    static int count = 2;
    static boolean flagEvent = false;

    @Override
    public void process(List<Integer> list) throws Failure2, Failure22 {
        if (count-- > 1) {
            list.add(15);
        } else {
            list.add(10);
        }
        if (count < 0) {
            if (!flagEvent) {
                throw new Failure2();
            } else {
                throw new Failure22(); // три раза отработали
            }
        }
    }
}

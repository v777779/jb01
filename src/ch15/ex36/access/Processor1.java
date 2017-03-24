package ch.ex36.access;

import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class Processor1 implements IProcessor<String, Failure1,Failure12> {  // T=String E=Failure1
    static int count = 3;
    static boolean flagEvent = false;
    @Override
    public void process(List<String> list) throws Failure1,Failure12 {
        if (count-- > 1) {
            list.add("Help!");
        } else {
            list.add("Ho!");
        }
        if (count < 0) {
            if (!flagEvent) {
                throw new Failure1(); // три раза отработали
            }else {
                throw new Failure12(); // три раза отработали
            }
        }
    }
}

package ch12.ex23.access;

import java.util.Random;

/**
 * Created by V1 on 03-Mar-17.
 */
public class FConst {
    FTerm f1;
    FTerm f2;

    public FConst() throws Exception {
        f1 = new FTerm();
// область fail Exception
        try {
            if (new Random().nextBoolean()) {
                throw new Exception();
            }
        } catch (Exception e) {
            f1.dispose();           // так как второй не создан, а первый уже ок
            throw e;
        }
        f2 = new FTerm();
    }

    public void dispose() {
        f1.dispose();
        f2.dispose();

    }

}

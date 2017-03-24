package ch07.ex1.local;

import static lib.utils.Print.p;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Bath {
    private String
            s1 = "Happy",
            s2,
            s3;
    private Soap soap;
    private int i;
    private float toy;

    public Bath() {
        p("Bath Constructor() ");
        s2 = "Glad";        // инициализация в конструкторе
        soap = new Soap();  // инициализация в конструкторе
    }

    {
        i = 12;             // анонимный блок инициализации
        toy = 2.34f;        // анонимный блок инициализации
    }

    @Override
    public String toString() {
        if (s3 == null) {
            s3 = "Smile"; // инициализация отложенная в методе
        }
        return ("s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "soap = " + soap
        );

    }
}

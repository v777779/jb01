package ch20.ex04.codec;


import lib.units.atunit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 25-Apr-17.
 */
public class AtUnitExample2 {
    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test void assertExample() {
        assert methodOne().equals("This is methodOne") : "It's not OK";
    }

    @Test void assertFailureExample() {
        assert 1==2: "What a surprise!";  // здесь он должен сработать
    }

    @Test void exceptionExample() throws IOException {
            new FileInputStream("noFile.txt");  // здесь должно сработать исключение
    }

    @Test boolean assertAndReturn() {
        assert methodTwo() == 2 :"methodTwo() must equal 2";    // assert fail with message
        return methodOne().equals("This is methodOne");         // test ok
    }

//    @Test void exceptionMsgExample() throws IOException {
//        try {
//            new FileInputStream("noFile.txt");  // здесь должно сработать исключение
//
//        } catch (IOException e) {
//            throw new IOException("<This is local message from @Unit> "+e);
//        }
//    }
}

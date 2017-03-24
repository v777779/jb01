package ch06.ex01;   // означает что класс в пакете ch06.ex01  путь <sources_root>/ch06.ex01

/**
 * Created by V1 on 07-Feb-17.
 */


import lib.utils.ArrayUtils;
import lib.utils.Msg;

import java.util.ArrayList;

import static lib.utils.Print.*;
import static lib.debug.Debug.*;

//import static libtest.DebugOff.debug;   // импортируется метод debug() который работает как Off


public class Ex1 {
    public static void main(String[] args) {
        Echo echo = new Echo();
        Can can = new Can();

        echo.show();
        can.show();
        ArrayList arrayList = new ArrayList();
        ArrayUtils arrayUtils = new ArrayUtils();
        Msg.printChr(echo.getCh("Str"));
        p("strwe");
        p();
        pf("Test pf %02d %s %5.1f \n",2,"232", 2.45);
        pp("Now it's possible > ");
        p(100);
        p(100L);

       debug();


    }
}

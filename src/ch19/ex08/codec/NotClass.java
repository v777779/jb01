package ch19.ex08.codec;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class NotClass {
    private class Int {};

//    void f1(LakeClass.WINKEN node) { // не работает, объект создать нельзя
//
//    }
    public static void check() {
        System.out.println("WINKEN class :"+LakeClass.WINKEN.getClass());
        System.out.println("BLINKEN class:"+LakeClass.BLINKEN.getClass());
        System.out.println("NOD     class:"+LakeClass.NOD.getClass());
        NotClass nt = new NotClass();
        NotClass.Int ntInt = new NotClass().new Int();
        System.out.println("nt      class:"+nt.getClass());
        System.out.println("nt.Int  class:"+ntInt.getClass());


    }

}

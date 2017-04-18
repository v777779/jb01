package ch19.ex02.codeb;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class UpCastEnum {
    public static  void  check() {
        Search[] vals = Search.values();
        Search k = Search.HITTER;
        Enum e = Search.HITTER; // объект назначен по восходящему
//values()
        System.out.print("vals :[");
        for (Search val : vals) {
            System.out.print(val+" ");
        }
        System.out.println("]");
//values()
        System.out.print("k[]  :[");
        for (Search search : k.values()) {
            System.out.print(search+" ");
        }
        System.out.println("]");

        //        System.out.println(e.values()); // не работает
//getEnumConstants()
        System.out.print("eVals:[");
        for (Enum anEnum : e.getClass().getEnumConstants()) {
            System.out.print(anEnum+" ");
        }
        Enum[] eVals = e.getClass().getEnumConstants();
        System.out.println("]");

    }
}

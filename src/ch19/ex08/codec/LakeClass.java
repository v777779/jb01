package ch19.ex08.codec;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public enum LakeClass {
    WINKEN {
        void behavior() {
            System.out.println("LakeClass.WINKEN");
        }
    },
    BLINKEN {
        void behavior() {
            System.out.println("LakeClass.BLINKEN");
        }
    },
    NOD {
        void behavior() {
            System.out.println("LakeClass.NOD");
        }
    },



}

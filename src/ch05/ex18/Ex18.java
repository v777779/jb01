package ch05.ex18;

import ch05.ex17.Msg;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex18 {
    public static void main(String[] args) {
        Msg[] msgs = new Msg[]{
                new Msg("1"),   new Msg("2"),
                new Msg("3"),   new Msg("r"),
                new Msg("543"), new Msg("sdfs"),
                new Msg("ASD"), new Msg("KL"),
                new Msg("Ad"),  new Msg("l;=")
        };

        Msg[] msgr = new Msg[10];
        for (int i = 0; i < msgr.length; i++) {
             msgr[i] = new Msg("Message Number "+ i);  // конструкторы сработали
        }
//        System.out.println();  // конструкторы сработали
//        for (Msg msg : msgs) {
//            System.out.println(msg.s);
//        }

    }
}

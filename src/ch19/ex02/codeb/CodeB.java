package ch19.ex02.codeb;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nUpCast and values() Check\n");
        System.out.println("UpCast field Access:");
        UpCastEnum.check();
        System.out.println("NonEnum field Access:");
        NonEnum.check();
    }
}

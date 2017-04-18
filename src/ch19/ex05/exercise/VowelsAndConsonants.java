package ch19.ex05.exercise;

import java.util.Random;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class VowelsAndConsonants {
    private static Random rnd = new Random();

    private enum Letters {
        VOWEL("aeiou"),
        SOMETIMES_A_VOWEL("yw"),
        CONSONANT("bcdfghjklmnpqrstvxz");

        char[] chs;
        String s;

        Letters(char[] chs) {
            this.chs = chs;
        }

        Letters(String s) {
            this.s = s;
        }

        public static Letters get(char c) {
            for (Letters letter : Letters.values()) {
                if (letter.s.contains("" + c)) {
                    return letter;
                }
            }
            throw new RuntimeException("Unknown char");
        }
    }

    public static void checkEnum() {
        for (int i = 0; i < 100; i++) {
            int c = rnd.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ":");

            switch (Letters.get((char) c)) {
                case VOWEL:
                    System.out.println("vowel");
                    break;
                case SOMETIMES_A_VOWEL:
                    System.out.println("somtimes vowel");
                    break;
                case CONSONANT:
                    System.out.println("consonant");
                    break;
                default:
                    throw new RuntimeException("Unknown char");
            }
        }
    }

    public static void check() {
        for (int i = 0; i < 100; i++) {
            int c = rnd.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ":");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("somtimes vowel");
                    break;
                default:
                    System.out.println("consonant");
                    break;
            }
        }
    }

}

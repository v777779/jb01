package lib.generate;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Created by V1 on 25.03.2017.
 */
public class GenRnd {
    private static Random rnd = new Random();
    public static class GenBool implements IGenerator<Boolean> {
        @Override
        public Boolean next() {
            return rnd.nextBoolean();
        }
    }

    public static class GenByte implements IGenerator<Byte> {
        @Override
        public Byte next() {
            return (byte)rnd.nextInt();
        }
    }


    public static class GenChar implements IGenerator<Character> {
        private static char[] chs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        @Override
        public Character next() {
            return new Character(chs[rnd.nextInt(chs.length)]);// случайный индекс
        }
    }

    public static class GenStr implements IGenerator<String> {
        private int length = 7;  // длина строки
        IGenerator<Character> cg = new GenChar();  // один экземпляр Character на один String
        public GenStr() {
        }

        public GenStr(int length) {  // задать длину строки если что
            this.length = length;
        }
        @Override
        public String next() {
           char[]chs = new char[length];
            for (int i = 0; i < chs.length; i++) {
                chs[i] = cg.next();
            }
            return new String(chs);
        }
    }
    public static class GenShort implements IGenerator<Short> {
         @Override
        public Short next() {
            return (short)rnd.nextInt();
        }
    }


    public static class GenInt implements IGenerator<Integer> {
        private int mod = 10000;

        public GenInt() {
        }

        public GenInt(int mod) {
            this.mod = mod;
        }

        @Override
        public Integer next() {
            return rnd.nextInt(mod);  // диапазон
        }
    }


    public static class GenLong implements IGenerator<Long> {
        private long value = 0;

        @Override
        public Long next() {
            return value++;
        }
    }

    public static class GenFloat implements IGenerator<Float> {
        @Override
        public Float next() {
            int  res = Math.round(rnd.nextFloat()*100); // до двух знаков
            return ((float)res/100); // сначала обратно во float затем деление
        }
    }
    public static class GenDouble implements IGenerator<Double> {
        @Override
        public Double next() {
            int  res = Math.round(rnd.nextFloat()*100); // до двух знаков

            return ((double)res)/100; // сначала обратно в Double затем деление
        }
    }

}

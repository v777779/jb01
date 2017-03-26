package lib.generate;

import lib.utils.IGenerator;

/**
 * Created by V1 on 25.03.2017.
 */
public class GenSeq {
    public static class GenBool implements IGenerator<Boolean> {
        private boolean value = false;

        @Override
        public Boolean next() {
            value = !value;
            return value;
        }
    }

    public static class GenByte implements IGenerator<Byte> {
        private byte value = 0;

        @Override
        public Byte next() {
            return value++;
        }
    }


    public static class GenChar implements IGenerator<Character> {
        private static char[] chs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        private int index = -1;

        @Override
        public Character next() {
            index++;
            return new Character(chs[index%chs.length]);// остаток от длины массива chs
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
        private int value = 0;

        @Override
        public Short next() {
            return (short)value++;
        }
    }

    public static class GenInt implements IGenerator<Integer> {
        private int value = 0;

        @Override
        public Integer next() {
            return value++;
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
        private float value = 0F;

        @Override
        public Float next() {
            return (value +1.0F);
        }
    }
    public static class GenDouble implements IGenerator<Double> {
        private double value = 0;

        @Override
        public Double next() {
            return (value+ 1.0);
        }
    }

}

package ch16.ex16.access;

import lib.utils.IGenerator;

/**
 * Created by V1 on 25.03.2017.
 */
public class SkipGen {
    public static class GenBool implements IGenerator<Boolean> {
        private boolean value = false;
        private boolean step = false;

        public GenBool() {
        }

        public GenBool(boolean step) {
            this.step = step;
        }
        public GenBool(boolean value, boolean step) {
            this.value = value;
            this.step = step;
        }

        @Override
        public Boolean next() {
            value ^= step;
            return value;
        }
    }

    public static class GenByte implements IGenerator<Byte> {
        private byte value;
        private byte step = 1;

        public GenByte() {
        }

        public GenByte(byte step) {
            this.step = step;
        }

        @Override
        public Byte next() {
            value += step;
            return value;
        }
    }


    public static class GenChar implements IGenerator<Character> {
        private static char[] chs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        private int index = -1;
        private int step = 1;

        public GenChar() {
        }

        public GenChar(int step) {
            this.step = step;
        }

        @Override
        public Character next() {
            index+=step;
            return new Character(chs[index % chs.length]);// остаток от длины массива chs
        }
    }

    public static class GenStr implements IGenerator<String> {
        private int length = 7;  // длина строки
        IGenerator<Character> cg;


        public GenStr() {
            cg = new GenChar();  // один экземпляр Character на один String
        }

        public GenStr(int step) {
            cg = new GenChar(step);  // один экземпляр Character на один String
        }

        public GenStr(int length, int step) {  // задать длину строки если что
            this.length = length;
            cg = new GenChar(step);  // один экземпляр Character на один String
        }

        @Override
        public String next() {
            char[] chs = new char[length];
            for (int i = 0; i < chs.length; i++) {
                chs[i] = cg.next();
            }
            return new String(chs);
        }
    }

    public static class GenShort implements IGenerator<Short> {
        private short value;
        private short step = 1;

        public GenShort() {
        }

        public GenShort(short step) {
            this.step = step;
        }

        @Override
        public Short next() {
            value = (short)(value + step);
            return value;
        }
    }

    public static class GenInt implements IGenerator<Integer> {
        private int value;
        private int step = 1;

        public GenInt() {
        }

        public GenInt(int step) {
            this.step = step;
        }

        @Override
        public Integer next() {
            value += step;
            return value;
        }
    }


    public static class GenLong implements IGenerator<Long> {
        private long value;
        private long step = 1;

        public GenLong() {
        }

        public GenLong(long step) {
            this.step = step;
        }

        @Override
        public Long next() {
            value += step;
            return value;
        }
    }

    public static class GenFloat implements IGenerator<Float> {
        private float value;
        private float step = 1.0F;

        public GenFloat() {
        }

        public GenFloat(float step) {
            this.step = step;
        }

        @Override
        public Float next() {
            value =((float)Math.round((value + step)*100.0))/100;
            return (value);
        }
    }

    public static class GenDouble implements IGenerator<Double> {
        private double value = 0;
        private double step = 1.0;

        public GenDouble() {
        }

        public GenDouble(double step) {
            this.step = step;
        }

        @Override
        public Double next() {
            value =((double)Math.round((value + step)*100.0))/100;
            return (value);
        }
    }



}

package ch14.ex10.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static String getType(char[] chs) {
        if (chs.getClass().getSuperclass() == Object.class) {
            return "Object";
        }
        return "primitive";
    }


    private static String getType(int[] chs) {
        if (chs.getClass().getSuperclass() == Object.class) {
            return "Object";
        }
        return "primitive";
    }

    private static String getType(long[] chs) {
        if (chs.getClass().getSuperclass() == Object.class) {
            return "Object";
        }
        return "primitive";
    }
    private static String getType(float[] chs) {
        if (chs.getClass().getSuperclass() == Object.class) {
            return "Object";
        }
        return "primitive";
    }

    private static String getType(double[] chs) {
        if (chs.getClass().getSuperclass() == Object.class) {
            return "Object";
        }
        return "primitive";
    }


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 Class Check\n");
        char[] chs = "sdfjhsdjkfheruhi".toCharArray();
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        long[] longs = new long[]{1, 2, 3, 4, 5, 6};
        float[] floats = new float[]{1, 2, 3, 4, 5};
        double[] doubles = new double[]{1, 2, 3, 4, 5};

        System.out.println("char[]:" + getType(chs));
        System.out.println("int[]:" + getType(ints));
        System.out.println("long[]:" + getType(longs));
        System.out.println("float[]:" + getType(floats));
        System.out.println("double[]:" + getType(doubles));


    }
}

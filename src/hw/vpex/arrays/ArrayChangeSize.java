package hw.vpex.arrays;

/**
 * Vadim Voronov
 * Created: 12-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ArrayChangeSize {
    static double[] arr = new double[5]; // начальный размер массива
    static int size = 5; // начальный размер данных

    static String arrToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <arr.length ; i++) {
            sb.append(String.format("%.2f, ",arr[i]));
        }
        sb.append("]");
        return sb.toString();
    }

    static void set(double val, int pos) {
        arr[pos] = val;
    }

    static void arrAdd(int addLength) {  // перевыделение памяти
        double[] newArray = new double[arr.length+addLength]; // массив нового размера
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    static void insert(double val, int pos)    {
        assert pos >= 0;
        assert pos <= size;
        if (size + 1 >= arr.length)  {
            arrAdd(arr.length/2);
        }
        for (int i = size; i >= pos; i--)  {
            assert i < arr.length;
            arr[i+1]=arr[i];
        }
        set(val, pos);
        size++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            arr[i] = i*Math.PI;
        }
        System.out.println(arrToString());
        insert(12.0,3);
        System.out.println(arrToString());
        insert(14.0,3);
        insert(14.0,3);
        System.out.println(arrToString());


    }

}

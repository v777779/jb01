package hw.vpex;

import java.util.Arrays;

/**
 * Vadim Voronov
 * Created: 12-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        // Scanner num = new Scanner(System.in);
        int a, b, c;
        //a = ((int)Math.random()*10);
        int i = 5;
        int size = i;
        int[] nums = new int[size];
        while (i > 0) {
            a = ((int) (Math.random() * 100 + 100));
            nums[i-1] = a;
            System.out.println("Рандомное число равно " + a + " , ");

            i--;
        }
        Arrays.sort(nums);
        System.out.println("Наибольшее число:"+nums[size-1]);
    }


}

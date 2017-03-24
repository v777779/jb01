package ch04.hw2;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Ex2 {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = Integer.valueOf(args[1]);
            if(n <= 0 ) {
                System.out.println("Wrong arguments. Please Positive Number");
            }
            System.out.print("Fibonacci row: 1 ");
            if (n == 1) {
                return;
            }
            int c1 = 0;
            int c2 = 1;
            int  c = 0;
            for (int i = 1; i < n; i++) {
                c = c1+c2;
                c1 = c2;
                c2 = c;
                System.out.print(c+" ");
            }

        } catch (Exception e) {
            System.out.println("Wrong arguments. Please <Fibonacci 5>");
        }
        }
    }

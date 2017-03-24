package ch04.ex02;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Comp {

  public static void rand(int i, int j, int rnd){
        String s;
        int c =  rnd;   // rnd.nextInt(100)
        s = String.format("%02d. rnd = %02d  i = %02d ",(j),c,i) ;
        if (c > i) {
            s +=  " c > i";
        }
        if (c == i) {
            s +=  " c = i";
        }
        if (c < i) {
            s +=  " c < i";
        }
        System.out.println(s);
    }

}

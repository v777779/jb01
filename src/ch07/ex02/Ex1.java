package ch07.ex02;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\nExtends Check Super\n");
        Cleanser cl = new Cleanser();
        cl.check();
        Detergent dt = new Detergent();
        dt.check();
        Sterilizer st = new Sterilizer();
        st.check();


    }

}

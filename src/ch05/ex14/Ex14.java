package ch05.ex14;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex14 {
    public static void main(String[] args) {
        int i;
        Message.show();




        System.out.println("\nAnonimous Class Check\n");
        class Mbr {
            String s = "message_inside_3";
            int i;
            {
                i = 15;
            }

            Mbr() {

            }
            Mbr(int i) {
                this.i = i;
            }
            void show() {
                System.out.println(s+" "+this.i);
            }
        }

        Mbr m = new Mbr();
        Mbr k = new Mbr(10);
        m.show();
        k.show();

    }
}

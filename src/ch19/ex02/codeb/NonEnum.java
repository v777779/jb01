package ch19.ex02.codeb;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class NonEnum {
    private int value;
    private String s;
    public Search enumHIT = Search.HITTER;
    public Search enumYON = Search.YON;


    public static void check() {
        Class<Integer> intClass = Integer.class;
        try {


            System.out.println("Check Integer object");
            Integer[] iEnums = intClass.getEnumConstants();
            System.out.println("intClass.getEnumConstants():"+iEnums);
            if (iEnums != null) {
                for (Integer integer : intClass.getEnumConstants()) {
                    System.out.print(integer + " ");
                }
            }

            System.out.println("\nCheck NonEnum object");
            NonEnum ne = new NonEnum();

            NonEnum[] nEnums = ne.getClass().getEnumConstants();
            System.out.println("ne.getClass().getEnumConstants():"+nEnums);

            if (nEnums != null) {
                for (NonEnum nonEnum : nEnums) {
                    System.out.print(nonEnum + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

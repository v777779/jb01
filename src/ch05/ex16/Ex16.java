package ch05.ex16;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex16 {
    public static void main(String[] args) {
        int[] ints = new int[10];                        // массив примитивов  {0}
        int[] intd = new int[] {1,2,3,4,5,6,7,8};        // массив примитивов
        int[] inte = new int[] {1,};
        Integer [] intObj = new Integer[10] ;            // массив объектов неинициализированный
        Integer [] intb = new Integer[] {1,2,3,4,5} ;    // массив объектов автоупаковка
        Integer [] intс = new Integer[] {new Integer(1),new Integer(2),new Integer(3)} ;

        int[] intf =  {1,2,3,4,5,6,7,8};        // массив примитивов
        Integer [] intg = {new Integer(1),new Integer(2),new Integer(3)} ;


        System.out.print("ints > ");
        for (int i : ints) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("intd > ");
        for (int i : intd) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("inte > ");
        for (int i : inte) {
            System.out.print(i+ " ");
        }
        System.out.println();



        System.out.print("Integer > ");
        for (Integer i : intObj) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = 0; i < intObj.length; i++) {
            intObj[i] = i;
        }

        System.out.print("Integer > ");
        for (Integer i : intObj) {
            System.out.print(i+ " ");
        }
        System.out.println();


        System.out.println("\nExercise 16\n");
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
              strings[i] = "Array string record "+i;
        }

        for (String string : strings) {
            System.out.println(string);
        }


    }
}

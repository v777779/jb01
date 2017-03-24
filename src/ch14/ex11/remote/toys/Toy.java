package ch14.ex11.remote.toys;

/**
 * Created by V1 on 08-Mar-17.
 */
public class Toy {
    private static int count = 1;
//    public Toy() {
//    }
    public Toy(int i) {
    }

    static {
            System.out.println("Load: Toy");
    }

    public static void printInfo(Class c) {
        count++;
        System.out.printf(count + ":Имя класса:%-25s interface:%-25s\n", c.getName(), c.isInterface());
        System.out.printf(count + ":simpleName:%-25s  fullName:%-25s\n", c.getSimpleName(), c.getCanonicalName());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Toy";
    }


}

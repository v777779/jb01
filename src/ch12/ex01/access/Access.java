package ch12.ex01.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static int f() {
        int  i = 1;
        try {
            i = 2;
            System.out.print("try f() i="+i+ " >" );
            return i;
        } catch (Exception e) {
            i=3;
            System.out.print("catch f() i="+i+ " >" );
            return i;
        }finally {
            i = 5;
            System.out.print("finally f() i="+i+ " >" );
        }
    }

    public static int g() {
        int  i = 1;
        try {
            i = 2;
            System.out.print("try g() i="+i+ " >" );
            throw  new Exception();
        } catch (Exception e) {
            i=3;
            System.out.print("catch g() i="+i+ " >" );
            return i;
        }finally {
            i = 5;
            System.out.print("finally g() i="+i+ " >" );
        }

    }

    public static int h() {
        int  i = 1;
        try {
            i = 2;
            System.out.print("try h() i="+i+ " >" );
            throw  new Exception();
        } catch (Exception e) {
            i=3;
            System.out.print("catch h() i="+i+ " >" );
            return i;
        }finally {
            i = 5;
            System.out.print("finally h() i="+i+ " >" );
            return i;
        }

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Exception Check\n");
        try {
            System.out.println("try called");
            throw new Exception("exception from main()");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally called.exception");
        }
//try_catch_finally
        System.out.println("Try_Catch_Finally :");
        System.out.println("main()            :");
        int  k = 1;
        try {
            System.out.println("try called");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally called.no exception");
            k = 5;
        }
        System.out.println("main() exit value k > "+k);

        System.out.println("f()            :");
        System.out.println("\nf() exit value > "+f());
        System.out.println("g()            :");
        System.out.println("\ng() exit value > "+g());
        System.out.println("h()            :");
        System.out.println("\nh() exit value > "+h());

    }
}

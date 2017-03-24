package ch12.ex1.local;

import java.util.UnknownFormatConversionException;
import java.util.UnknownFormatFlagsException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    private static void f5() throws Exception {
        System.out.println("5th level. ");
        throw new UnsatisfiedLinkError("Unsatisfied Link");   // сами генерим исключение, любой уровень вложенности может быть
    }

    private static void f4() throws Exception {
        System.out.print("4th level > ");
        f5();

    }

    private static void f3() throws Exception {
        System.out.print("3rd level > ");
        f4();

    }

    private static void f2() throws Exception {
        System.out.print("2nd level > ");
        f3();
    }

    private static void f1() throws Exception {
        System.out.print("1st level > ");
        f2();
    }


    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nException Check\n");
//        System.out.println(Range.arrayList(10));

        System.out.println("\nMultilevel Exception:");
        try {                                       // блок проверки исключения
            f1();   // сами генерим исключение, любой уровень вложенности может быть
            throw new Exception("New Exception");
        } catch (UnknownFormatFlagsException e) {
            System.out.println("Unknown Format Flags:");
            System.out.println(e.getMessage());
        } catch (UnknownFormatConversionException e) {
            System.out.println("Unknown Format Conversion:");
            System.out.println(e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation:");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        } catch (Error e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());

        }



// прерывание и возобновление с Exception
        System.out.println("\nWhile Exception Renew:");
        int k = 0;
        boolean flag = true;
        while (flag) {

            try {
                if (k < 10) {
                    throw new Exception("Exception from while cycle");
                } else {
                    flag = false; // выходим из цикла
                }

            } catch (Exception e) {
                System.out.println("Catch called :"+k++);

            }

        }
        System.out.println("Exception overrided b y k:"+k);
// Custom Exception
        System.out.println("\nUser Exception Init:");
        try {
            throw new CustomException("Message from Custom Exception");
        } catch (CustomException e) {
            System.out.print("Catch called: ");
            System.out.println(e.getMessage());
        }
//Custom Exception 2 Default
        System.out.println("\nCustom Class with Exception and Custom Exception:");
        ClassWithException cwEx = new ClassWithException();
        try {
            cwEx.f();               // только после окружения блоком try/catch
        } catch (SimpleException e) {
            System.out.println("Catched called: ");
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Catched by Exception");
        }
//Custom Exception 2 String
        System.out.println("\nCustom Class with Exception and Custom Exception:");
        try {
            cwEx.g();               // только после окружения блоком try/catch
        } catch (MyException e) {
            System.out.print("Catched called: ");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }


    }
}

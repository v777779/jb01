package ch15.ex34.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    private class GenericOverload <T, W> {
//        public void f1(T arg) {  // не компилируется одинаковое число аргументов
//        }
//        public void f1(W arg) {  // перегрузка не работает
//        }
    }
    private class GenericOverload2 <T, W> {
        public void f1(T arg) {  // компилируется имена функций разные
        }
        public void f2(W arg) {  // это уже не перегрузка
        }
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMethod Overloadw Generic Check\n");

    }
}

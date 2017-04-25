package ch20.ex01.codea;

import java.lang.reflect.Method;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nAnnotation Check\n");


        System.out.println("Processing Anootations:");
        UseCaseTracker.check();


        for (Method method : PasswordUtils.class.getDeclaredMethods()) {
            UseCase uc = method.getAnnotation(UseCase.class);  // получить аннотацию данного типа для метода
            if (uc != null) {
                System.out.println("Found UseCase:" + uc.id() + " " + uc.description());
            }

        }
    }
}

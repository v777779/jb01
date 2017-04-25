package ch20.ex01.codea;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class UseCaseTracker {
    private static void trackUseCases(List<Integer> useCases, Class<?> className) {
        for (Method method : className.getDeclaredMethods()) {
            UseCase uc = method.getAnnotation(UseCase.class);  // получить аннотацию данного типа для метода
            if (uc != null) {
                System.out.println("Found UseCase:"+uc.id()+" "+uc.description());
                useCases.remove(new Integer(uc.id())); // удалить из списка отработанные
            }
        }
        for (int useCase : useCases) {
            System.out.println("Warning: Missing use case-"+useCase);
        }
    }

    public static void check() {
        List<Integer> useCases = new ArrayList<>(Arrays.asList(47,48,49,50));
        trackUseCases(useCases,PasswordUtils.class);


    }
}

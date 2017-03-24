package ch14.ex11.access.unit.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 09-Mar-17.
 */
public class PetName extends PetMake {                          // все методы PetMake плюс List types есть
    private static String[] typeClassNames = new String[]{
            "Pug", "Mutt", "EgCat", "Manx", "Cymr", "Rat", "Mouse", "Hamster","Gerbil"
    };
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    static {
        try {
            String pkg = PetName.class.getPackage().toString().replaceFirst("p\\w+\\s", "");

            for (String s : typeClassNames) {
                types.add((Class<?extends Pet>)Class.forName(pkg+"."+s)); // кастинг обязателен
            }

        } catch (Exception e) {
            System.out.println("catch:Pet Class Not Found");
            throw new RuntimeException();
        }
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}

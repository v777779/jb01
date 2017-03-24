package ch14.ex11.unit.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 09-Mar-17.
 */
public class PetNameL extends PetMake {
    private static final Class<?extends Pet> [] typeArray = new Class[]{
            Pet.class,Dog.class,Cat.class,Rodent.class,
            Pug.class,Mutt.class,EgCat.class,Manx.class,Cymr.class,
            Rat.class,Mouse.class,Hamster.class
    };
    public static final List<Class<?extends Pet>> alltypes = Collections.unmodifiableList(Arrays.asList(typeArray));
    private static final int indexStart =alltypes.indexOf(Pug.class);
    private static final int indexEnd =alltypes.size();

    private static final List<Class<?extends Pet>> types = alltypes.subList(indexStart,indexEnd);

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

}

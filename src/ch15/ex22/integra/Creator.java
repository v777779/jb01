package ch15.ex22.integra;

/**
 * Created by V1 on 17.03.2017.
 */
public class Creator extends GenericWithCreate<ClassX>{
    @Override
    ClassX create() {
        return new ClassX();
    }
    void f() {
        System.out.println("element: "+element.getClass().getSimpleName());
    }
}

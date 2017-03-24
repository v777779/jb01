package ch.ex23.integra;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassH {
    public ClassE getE() {
        return new ClassE() {
            @Override
            public void show() {
                System.out.println("ClassE.ClassH.show");
            }
        };
    }

    public ClassG getD() {
        return new ClassG() {
            @Override
            public void show() {
                System.out.println("ClassD.ClassH.show");
            }
        };
    }

}

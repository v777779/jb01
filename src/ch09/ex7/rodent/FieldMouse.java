package ch09.ex7.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class FieldMouse extends Mouse implements Rodent {
    private boolean checkFinal = false;
    private int refCount = 0;

    public FieldMouse() {
        checkFinal = true;
        System.out.println("FieldMouse.Constructor");
    }
    @Override
    public void addRef() {   // вызывается конструктором базового класса
        refCount++;
    }

    @Override
    public void dispose() {
        if(--refCount == 0) {   // не пропускаем
            checkFinal = false;
            System.out.println("FieldMouse.dispose");
            super.dispose();
        }
        else {
            System.out.println("FieldMouse Reflink Check");
        }
    }

    @Override
    public String toString() {
        return "FieldMouse{"+
                "RefCount."+refCount+
                "}";
    }

    @Override
    public void voice() {
        System.out.println("FieldMouse.voice");
    }

    @Override
    public void eat() {
        System.out.println("FieldMouse.eat");
    }

    @Override
    public void sleep() {
        System.out.println("FieldMouse.sleep");
    }

    @Override
    public void run() {
        System.out.println("FieldMouse.run");
    }



}

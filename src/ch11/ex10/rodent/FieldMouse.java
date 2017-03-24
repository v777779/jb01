package ch11.ex10.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class FieldMouse extends Mouse {
    private boolean checkFinal = false;
    private int refCount = 0;

    public FieldMouse() {
        checkFinal = true;
    }
    @Override
    protected void addRef() {   // вызывается конструктором базового класса
        refCount++;
    }

    @Override
    protected void dispose() {

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
    void voice() {
        System.out.println("FieldMouse.voice");
    }

    @Override
    void eat() {
        System.out.println("FieldMouse.eat");
    }

    @Override
    void sleep() {
        System.out.println("FieldMouse.sleep");
    }

    @Override
    void run() {
        System.out.println("FieldMouse.run");
    }

    @Override
    public String toString() {
        return "FieldMouse{"+
                "Ref."+refCount+
                "}";
    }



}

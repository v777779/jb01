package ch10.ex24.access;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassB2 {
    InterfaceU [] uArray;
    private int next= 0;

    public ClassB2( int size) {
        this.uArray = new  InterfaceU[size]; // длина обуславливается внешним массивом
    }

    public void add(InterfaceU u) {
        if (next < uArray.length ) {
            uArray[next++] = u;   // получить ссылку и поместить в массив
        }

    }
    public void remove( int index) {
        if (index < uArray.length) {
            uArray[index] = null;   // сбросить ссылку
        }
    }

    public void show() {
        for (int i = 0; i < uArray.length ; i++) {
            if (uArray[i] == null) {
                continue;
            }
            System.out.println("Index."+i);
            uArray[i].init();
            uArray[i].play();
            uArray[i].status();
        }

    }

}

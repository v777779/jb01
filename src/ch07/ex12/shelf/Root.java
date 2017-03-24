package ch07.ex12.shelf;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Root {
    int[] ints;
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root(int[] ints) {
        component1 = new Component1(ints[0]);   // первый создается
        component2 = new Component2(ints[1]);   // второй создается
        component3 = new Component3(ints[2]);   // третий создается
        System.out.println("Root.Constructor Done");  // конструктор общие данные создаются последними
    }

    void dispose() {
        System.out.println("Root.dispose"); // общие данные удаляются первыми
        component3.dispose(); // первым удаляется
        component2.dispose(); // вторым удаляется
        component1.dispose(); // третьм удаляется
    }

}

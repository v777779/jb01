package ch07.ex12.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class CadSystem extends Shape {
private Circle c;
private Triangle t;
private Line[] lines = new Line[3];


    public CadSystem(int i) {
        super(i+1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j,j*j); // инициализируем линии
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("CadSystem.Constructor Mixed");
    }

    public void dispose() {
        System.out.println("CadSystem.dispose");
        t.dispose(); // в обратном порядке
        c.dispose(); //
        for (int i = 0; i < lines.length; i++) {
            lines[i].dispose();
        }
        super.dispose(); // базовый класс для CadSystem
    }
}

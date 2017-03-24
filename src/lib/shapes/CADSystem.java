package lib.shapes;

/**
 * Created by V1 on 02-Mar-17.
 */
public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3]; // три линии

    public CADSystem(int i) {  // конструктор
        super();
        for (int j = 0; j < lines.length ; j++) {
            lines[j] = new Line();
        }
        c = new Circle();
        t = new Triangle();
    }

    public void dispose() {  // разваливаем в обратном порядке
        t.dispose();
        c.dispose();
        for (int i = lines.length-1; i >=0 ; i--) {
            lines[i].dispose();
        }
        super.dispose(); // предка разрушаем в самом конце
    }
}

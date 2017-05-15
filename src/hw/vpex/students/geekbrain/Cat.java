package hw.vpex.students.geekbrain;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Cat extends Animal {
    public static Cat cat1Clone;

    public Cat(String name, String type, String voice, int age, int speed) {
        super(name, type, voice, age, speed);
    }

    public static Cat getCat() {
        Cat cat1 = new Cat("Murka ", "Cat ", "Myuu ", 5, 25);
        return cat1;

    }

    public static void main() {
        Cat cat1 = new Cat("Murka ", "Cat ", "Myuu ", 5, 25);
        cat1Clone = cat1;
        System.out.println(cat1.name + cat1.type + cat1.voice + cat1.age + " "+cat1.speed);
    }
}

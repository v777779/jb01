package hw.vpex.students.geekbrain;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Dog {
    public static void main(String[] args) {
// если мы хотим обратиться к полю объекта Cat
        Cat cat2 = new Cat("Lapka ", "Cat ", "Murr ", 3, 16);
        System.out.println("Cat2: " + cat2.name + " " + cat2.type + " " + cat2.voice + " " + cat2.age + " " + cat2.speed);

// если нам нужна cat1 созданная классе Cat
        Cat cat3 = Cat.getCat();
        System.out.println("\nCat3: " + cat3.name + " " + cat3.type + " " + cat3.voice + " " + cat3.age + " " + cat3.speed);

// если мы хотим именно к  оригинальной cat1 которая создана в методе
        System.out.print("\nRun Cat.main(): ");
        Cat.main(); // создали внутри функции cat1 и заполнили cat1Clone

        Cat cat4 = Cat.cat1Clone;
        System.out.println("\nCa1Clone: " + cat4.name + " " + cat4.type + " " + cat4.voice + " " + cat4.age + " " + cat4.speed);

// доступ через методы класса Animal/Cat

        Cat cat5 = new Cat("Simka ", "Cat ", "Mooo ", 2, 21);
        System.out.println("\nCat5: " + cat5.getName() + " " + cat5.getType() + " " + cat5.getVoice() +
                                  " " + cat5.getAge() + " " + cat5.getSpeed());

    }
}

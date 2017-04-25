package ch18.ex31.exercise;

import java.util.Arrays;
import java.util.List;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 31 XML ArrayList Check\n");
        String fileName = "./src/ch18/ex31/exercise/People.xml";

        List<Person> people = Arrays.asList(
                new Person("Dr. Bunsen","Honeydew","ClarkDale,18"),
                new Person("Gonzo","The Great","LakeView,21"),
                new Person("Phillip J.","Fry","Tree Valley,15")
        );
        System.out.println(people);
        for (Person person : people) {
            person.addPerson();
        }

        Person.format(fileName);
        Person.readXML(fileName);

        List<Person> list = Person.restore(fileName);
        System.out.println("Restored List<Person>:");
        System.out.println(list);

        System.out.println("ArrayList Demo:");
        List<Person> listPerson = new People(fileName);
        System.out.println(listPerson);

    }
}

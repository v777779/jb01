package ch18.ex31.coded;

import java.util.Arrays;
import java.util.List;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class CodeD {
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nXML Person javax Version Check\n");
        String fileName = "./src/ch18/ex31/coded/People.xml";

        List<Person> people = Arrays.asList(
                new Person("Dr. Bunsen","Honeydew"),
                new Person("Gonzo","The Great"),
                new Person("Phillip J.","Fry")
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

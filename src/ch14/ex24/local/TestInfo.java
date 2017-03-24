package ch14.ex24.local;

/**
 * Created by V1 on 12-Mar-17.
 */
public class TestInfo {
    public static void printInfo() {
        System.out.println(Person.NULL);
        System.out.println(Person.NULL.getFirstName());
        System.out.println(Person.NULL.getLastName());
        System.out.println(Person.NULL.getAddress());

        Person p1 = new Person("A","B","C");
        Person p2 = new Person("C","D","E");

// SingleTone in Inner Class
        System.out.println(p1.NULL);
        System.out.println(p2.NULL);


// Standard SingleTone
        PersonS ps1 = new PersonS();
        PersonS ps2 = new PersonS();

        System.out.println(ps1);
        System.out.println(ps2);

        System.out.println(ps1.NULL);
        System.out.println(ps2.NULL);
//instanceOf
        System.out.println("instanceof:"+(Person.NULL instanceof Person));
        System.out.println("instanceof:"+(Person.NULL instanceof Person.NullPerson));
        System.out.println(" ==       :"+(Person.NULL == p1.NULL));

    }
}

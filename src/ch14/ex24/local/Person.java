package ch14.ex24.local;

/**
 * Created by V1 on 12-Mar-17.
 */
public class Person {
    public final String firstName;
    public final String lastName;
    public final String address;

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public static class NullPerson extends Person implements Null {  // встроенный класс
        private NullPerson() {                                      // нельзя создать объект класса
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return String.format("Person: <NULL>");
//            return this.getClass().getSimpleName()+"@"+ Integer.toHexString(this.hashCode());
        }
    }

    public static final Person NULL = new NullPerson();  // статический экземпляр класс SingleTone

    @Override
    public String toString() {  // for toString Position (title, <person>)
        return String.format("Person: %-6s %-8s addr: %s", firstName, lastName, address);
//        return super.toString()+" "+this.getClass().getName()+"@"+Integer.toHexString(this.hashCode());
    }
}
